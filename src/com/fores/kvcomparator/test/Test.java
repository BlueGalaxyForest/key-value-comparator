package com.fores.kvcomparator.test;

public class Test {
    public static void main(String[] args) {
        String m = "委托人展开 \n" +
                "*名称\n" +
                "测试同步1\n" +
                " *身份\n" +
                "被害人\n" +
                " \n" +
                "委托人展开 \n" +
                "*名称\n" +
                "测试同步2\n" +
                " *身份\n" +
                "犯罪嫌疑人\n" +
                " \n" +
                "委托当事人展开 \n" +
                "*名称\n" +
                "测试同步5\n" +
                " *身份\n" +
                "被害人亲属\n" +
                " \n" +
                "委托当事人展开 \n" +
                "*名称\n" +
                "测试同步3\n" +
                " *身份\n" +
                "原告人\n" +
                " \n" +
                "对方当事人展开 \n" +
                "名称\n" +
                "测试同步x\n" +
                " 身份\n" +
                "无\n" +
                " \n" +
                "对方当事人展开 \n" +
                "名称\n" +
                "测试同步y\n" +
                " 身份\n" +
                "再审申请人\n" +
                " \n" +
                "其他当事人展开 \n" +
                "名称\n" +
                "测试同步xx\n" +
                " 身份\n" +
                "被告人\n" +
                " \n" +
                "其他当事人展开 \n" +
                "名称\n" +
                "测试同步yy\n" +
                " 身份\n" +
                "犯罪嫌疑人\n" +
                " \n" +
                "当事人合同签署\n" +
                "当事人\n" +
                "请选择\n" +
                " 合同签署日期\n" +
                "受托人\n" +
                "*受托人\n" +
                "深圳总所\n" +
                " 合同签署日期\n" +
                "合同信息\n" +
                "案由\n" +
                "刑事>第三章 破坏社会主义市场经济秩序罪>第二节 走私罪>151-1.走私武器、弹药罪\n" +
                "合同编号\n" +
                " \n" +
                "盖章人\n" +
                " 保存合同时间\n" +
                "合同状态\n" +
                "合同完成\n" +
                " 结案时间\n" +
                "是否涉外  案源类型\n" +
                "非单位案源\n" +
                "*涉案标的\n" +
                "房产财产\n" +
                " *律师费\n" +
                "6000\n" +
                " 收费方式\n" +
                "比例收费\n" +
                "律师费约定\n" +
                "律师费约定测试\n" +
                "合同约定\n" +
                "合同约定测试\n" +
                "办理阶段-受托事项\n" +
                "侦查\n" +
                "审查起诉\n" +
                "一审\n" +
                "二审\n" +
                "死刑复核\n" +
                "再审申请\n" +
                "抗诉申请\n" +
                "执行\n" +
                "办理人\n" +
                "案源人\n" +
                "测试就一 - 北京分所>专职律师\n" +
                " 事项\n" +
                "洽谈,开庭,内勤（跟案）,外勤,执行,立案\n" +
                " \n" +
                "案源人\n" +
                "测试就一 - 深圳总所>推广部\n" +
                " 事项\n" +
                "鉴定,案源信息,审查文件,收集整理材料\n" +
                " \n" +
                "洽谈人\n" +
                "测试同步 - 法通>技术部>.NET组\n" +
                "阶段\n" +
                "侦查,审查起诉,一审,二审\n" +
                " 事项\n" +
                "洽谈,开庭,内勤（跟案）,收集整理材料\n" +
                " \n" +
                "洽谈人\n" +
                "测试就一 - 上海分所>公司业务部\n" +
                "阶段\n" +
                "侦查,审查起诉,一审,二审,死刑复核,再审申请,抗诉申请,执行\n" +
                " 事项\n" +
                "执行,立案,取证\n" +
                " \n" +
                "办理人\n" +
                "测试同步 - 深圳总所\n" +
                "阶段\n" +
                "死刑复核,再审申请,抗诉申请,执行\n" +
                " 事项\n" +
                "承办,鉴定,收集整理材料\n" +
                " \n" +
                "办理人\n" +
                "测试员八 - 深圳总所>技术部\n" +
                "阶段\n" +
                "侦查,一审,二审,再审申请\n" +
                " 事项\n" +
                "取证,会见,签单,协办\n" +
                " \n" +
                "协办人\n" +
                "测试员七 - 深圳总所>技术部\n" +
                "阶段\n" +
                "侦查,执行\n" +
                " 事项\n" +
                "洽谈,收集整理材料\n" +
                " \n" +
                "协办人\n" +
                "测试员八 - 深圳总所>技术部\n" +
                "阶段\n" +
                "抗诉申请,执行\n" +
                " 事项\n" +
                "审查文件,收集整理材料\n" +
                " \n" +
                "合办人\n" +
                "测试同步 - 深圳总所\n" +
                "阶段\n" +
                "侦查,审查起诉\n" +
                " 事项\n" +
                "洽谈,开庭\n" +
                " \n" +
                "归档人\n" +
                "测试就一 - 上海分所>公司业务部\n" +
                " \n" +
                "归档人\n" +
                "测试就一 - 深圳总所>推广部\n" +
                " \n" +
                "备注\n";
        String s = "业务类型";
        System.out.println(m.contains(s));
    }
}
