package gradledemo.application;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.library.dependencies.SliceRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;
import static java.util.stream.Collectors.joining;

class ArchitectureTest {

    @Test
    void checkForPackageCycles() {
        JavaClasses plan = new ClassFileImporter().importPackages("gradledemo");

        SliceRule sliceRule = slices().matching("apoplan.webadapter.(**)").should().beFreeOfCycles();

        sliceRule.check(plan);
    }
}
