package gradledemo.domain;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.library.dependencies.SliceRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

class ArchitectureTest {

    @Test
    void checkForPackageCycles() {
        JavaClasses plan = new ClassFileImporter().importPackages("gradledemo");

        SliceRule sliceRule = slices().matching("apoplan.domain.(**)").should().beFreeOfCycles();

        sliceRule.check(plan);
    }
}

