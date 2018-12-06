package cn.cerc.jui.parts;

import java.util.ArrayList;
import java.util.List;

import cn.cerc.mis.core.AbstractHandle;
import cn.cerc.mis.page.IMenuBar;

public class RightMenus extends AbstractHandle {
    private List<IMenuBar> items = new ArrayList<>();

    public List<IMenuBar> getItems() {
        return items;
    }

    public void setItems(List<IMenuBar> items) {
        this.items = items;
    }

}
