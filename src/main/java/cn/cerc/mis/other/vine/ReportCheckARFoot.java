package cn.cerc.mis.other.vine;

import org.springframework.stereotype.Component;

import cn.cerc.mis.core.IBookOption;

@Component
public class ReportCheckARFoot implements IBookOption {

    @Override
    public String getTitle() {
        return "销售对账页尾备注";
    }

}
