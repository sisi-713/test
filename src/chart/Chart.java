package chart;

import java.awt.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 * 柱形图类
 * @author by yqj;
 */
public class Chart {
  ChartPanel frame1;
  public  Chart(){

      CategoryDataset dataset = getDataSet();
      JFreeChart chart = ChartFactory.createBarChart3D(
                           "疑似例人数", // 图表标题
                          "月份", // 目录轴的显示标签
                          "人数", // 数值轴的显示标签
                          dataset, // 数据集
                          PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                          true,           // 是否显示图例(对于简单的柱状图必须是false)
                          false,          // 是否生成工具
                          false           // 是否生成URL链接
                          );

    //获取图表区域对象
      CategoryPlot plot=chart.getCategoryPlot();
    //水平底部列表
      CategoryAxis domainAxis=plot.getDomainAxis();
    //水平底部标题
       domainAxis.setLabelFont(new Font("黑体",Font.BOLD,14));  
     //垂直标题
       domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,12)); 
     //获取柱状
       ValueAxis rangeAxis=plot.getRangeAxis();
       rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
      //设置标题字体
        chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));

       frame1=new ChartPanel(chart,true);        
  }
     private static CategoryDataset getDataSet() {
         
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.addValue(3, "1月", "1月");
         dataset.addValue(2, "2月", "2月");
         dataset.addValue(4, "3月", "3月");
         dataset.addValue(1, "4月", "4月");
         dataset.addValue(2, "5月", "5月");
         dataset.addValue(1, "6月", "6月");
         dataset.addValue(0, "7月", "7月");
         dataset.addValue(1, "8月", "8月");
         dataset.addValue(1, "9月", "9月");
         dataset.addValue(0, "10月", "10月");
         dataset.addValue(0, "11月", "11月");
         dataset.addValue(0, "12月", "12月");            
         return dataset;
}
     public ChartPanel getChartPanel(){
         return frame1;

}


}
