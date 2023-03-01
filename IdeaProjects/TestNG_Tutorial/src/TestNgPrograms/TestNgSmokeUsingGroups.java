package TestNgPrograms;

import org.testng.annotations.Test;

public class TestNgSmokeUsingGroups {
    @Test(groups = "Developers")
    public void webDev() {
        System.out.println(" This is Web Dev");
    }

    @Test(groups = "UI Designer")
    public void cssDesginer() {
        System.out.println(" CSS Designer");
    }

    @Test(groups = "UI Designer")
    public void UIdesigner() {
        System.out.println(" UI Designer");
    }
}

class TestNgSmokeUsingGroups2 {
    @Test(groups = "Developers")
    public void iosDev() {
        System.out.println(" This is IOS dev");
    }

    @Test(groups = "UI Designer")
    public void UXdesigner() {
        System.out.println(" UX Designer");
    }

    @Test(groups = "Developers")
    public void androidDev() {
        System.out.println(" This is Mobile Dev");
    }
}

class TestNgSmokeUsingGroups3 {
    @Test(groups = "Developers")
    public void sqlDev() {
        System.out.println(" This is SQL Dev");
    }

    @Test(groups = "UI Designer")
    public void Vfxdesign() {
        System.out.println(" VFX Design");
    }
}
