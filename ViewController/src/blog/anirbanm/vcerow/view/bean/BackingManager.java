package blog.anirbanm.vcerow.view.bean;

import javax.faces.component.UIComponent;
import javax.faces.event.ValueChangeEvent;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

public class BackingManager {
    
    public BackingManager() {
    }

    public void onSalaryChange(final ValueChangeEvent valueChangeEvent) {
        final UIComponent salaryComponent = valueChangeEvent.getComponent();
        final JUCtrlHierNodeBinding nodeBinding = 
            (JUCtrlHierNodeBinding) salaryComponent.getAttributes().get("currentRow");
        final Row currentRow = nodeBinding.getRow();
        System.out.println(currentRow);
    }
}
