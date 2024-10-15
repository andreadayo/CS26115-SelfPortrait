/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs26115_selfportrait;

/**
 *
 * @author Dhea
 */

import java.awt.*;
import java.awt.geom.*;

public class CS26115_SelfPortrait extends Frame {
    public void paint(Graphics g) {
        addWindowListener(new CloseMyWindow());
        
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f); 
        g2d.setStroke(bs);

        // START NECK
        GeneralPath shape = new GeneralPath();
        shape.moveTo(506.6, 821.3);
        shape.lineTo(517.8, 530.7);
        shape.lineTo(761, 596.7);    
        shape.lineTo(724.6, 824.7); 
        shape.lineTo(506.6, 821.3);  
        shape.closePath();
        g2d.setPaint(Color.decode("#B08869"));
        g2d.fill(shape);  
        
        GeneralPath shape1 = new GeneralPath();
        shape1.moveTo(596.8, 644.1);
        shape1.curveTo(564.559, 609.684, 549.201, 588.248, 525, 547.5);
        shape1.curveTo(516.588, 575.882, 515.597, 594.053, 516.2, 627.9);
        shape1.curveTo(525.589, 640.962, 530.221, 648.668, 545.6, 658.1);
        shape1.curveTo(559.923, 670.256, 568.405, 674.21, 584.8, 673.3);
        shape1.curveTo(596.192, 664.383, 599.265, 658.155, 596.8, 644.1);
        shape1.closePath();
        g2d.setPaint(Color.decode("#BBA999"));
        g2d.fill(shape1); 
        
        GeneralPath shape2 = new GeneralPath();
        shape2.moveTo(568.6, 736.9);
        shape2.curveTo(577.421, 752.381, 581.833, 761.004, 587, 776.1);
        shape2.lineTo(606, 791.7);
        shape2.lineTo(628.6, 789.1);
        shape2.curveTo(617.294, 772.307, 612.602, 762.633, 606, 745.1);
        shape2.curveTo(589.495, 739.5, 581.666, 734.234, 568.6, 723.5);
        shape2.lineTo(568.6, 736.9);
        shape2.closePath();
        g2d.setPaint(Color.decode("#B39A8C"));
        g2d.fill(shape2);
        
        GeneralPath shape3 = new GeneralPath();
        shape3.moveTo(680.8, 730.3);
        shape3.curveTo(681.533, 743.355, 681.421, 750.331, 680.8, 762.5);
        shape3.lineTo(697.6, 739.7);
        shape3.lineTo(727.4, 689.5);
        shape3.lineTo(733.8, 654.3);
        shape3.curveTo(723.286, 672.834, 716.583, 682.968, 700.4, 699.7);
        shape3.curveTo(691.974, 707.274, 688.117, 712.579, 682.6, 723.7);
        shape3.lineTo(690.4, 730.3);
        shape3.lineTo(680.8, 730.3);
        shape3.closePath();
        g2d.setPaint(Color.decode("#89563D"));
        g2d.fill(shape3);
        
        GeneralPath shape4 = new GeneralPath();
        shape4.moveTo(537.2, 666.1);
        shape4.lineTo(527.4, 662.5);
        shape4.lineTo(552, 726.9);
        shape4.curveTo(555.575, 727.011, 556.836, 726.137, 557.8, 722.9);
        shape4.curveTo(553.285, 714.089, 551.952, 708.851, 552, 698.9);
        shape4.curveTo(544.307, 686.586, 541.192, 679.373, 537.2, 666.1);
        shape4.closePath();
        g2d.setPaint(Color.decode("#8B5C43"));
        g2d.fill(shape4);
        // END NECK
        
        // START SHIRT
        GeneralPath shape5 = new GeneralPath();
        shape5.moveTo(87.6, 886);
        shape5.lineTo(101, 900.2);
        shape5.lineTo(1073.6, 900.2);
        shape5.curveTo(1065.6, 881.6, 1053.2, 859.6, 1039.6, 845.2);
        shape5.curveTo(1030.6, 812.6, 1017.39, 800.2, 1003.6, 772);
        shape5.curveTo(988.384, 740.892, 978.624, 720.257, 951.6, 688.4);
        shape5.curveTo(917.099, 666.8, 904.41, 655.035, 867, 636.8);
        shape5.curveTo(856.653, 623.61, 849.73, 616.696, 835.9, 605);
        shape5.curveTo(825.084, 591.595, 818.172, 584.71, 804.8, 573.2);
        shape5.lineTo(739.2, 623.2);
        shape5.lineTo(730.6, 661.6);
        shape5.lineTo(718, 699.6);
        shape5.lineTo(681.8, 758.2);
        shape5.lineTo(651.6, 786.8);
        shape5.lineTo(613, 786.8);
        shape5.lineTo(577.6, 766.4);
        shape5.lineTo(561.6, 737.6);
        shape5.lineTo(534, 663.2);
        shape5.lineTo(525, 617);
        shape5.lineTo(525, 515);
        shape5.lineTo(455, 550.8);
        shape5.lineTo(373, 588.2);
        shape5.lineTo(233.2, 687);
        shape5.lineTo(174.2, 765);
        shape5.lineTo(87.6, 886);
        shape5.closePath();
        g2d.setPaint(Color.decode("#CFD3D2"));
        g2d.fill(shape5);

        
        GeneralPath shape6 = new GeneralPath();
        shape6.moveTo(476.4, 560.3);
        shape6.lineTo(452.6, 587.9);
        shape6.lineTo(451.4, 621.1);
        shape6.lineTo(459, 604.9);
        shape6.lineTo(476.4, 589.7);
        shape6.lineTo(467.6, 631.9);
        shape6.lineTo(474.2, 622.1);
        shape6.lineTo(479.4, 593.5);
        shape6.lineTo(509.4, 542.7);
        shape6.lineTo(507.6, 538.5);
        shape6.lineTo(476.4, 560.3);
        shape6.closePath();
        g2d.setPaint(Color.decode("#DCE0E0"));
        g2d.fill(shape6);

        GeneralPath shape7 = new GeneralPath();
        shape7.moveTo(175.2, 784.9);
        shape7.lineTo(167.6, 775.5);
        shape7.curveTo(188.554, 741.765, 201.349, 722.744, 233.2, 687.9);
        shape7.curveTo(282.455, 646.608, 315.691, 626.299, 373.2, 588.5);
        shape7.curveTo(404.043, 572.08, 422.582, 563.746, 457.4, 550.1);
        shape7.lineTo(504.2, 526.1);
        shape7.lineTo(508, 530.1);
        shape7.lineTo(472.4, 554.7);
        shape7.curveTo(457.483, 567.924, 449.978, 575.727, 437.6, 590.1);
        shape7.lineTo(437.6, 605.7);
        shape7.lineTo(431.2, 608.5);
        shape7.lineTo(416.6, 625.9);
        shape7.lineTo(413.2, 640.7);
        shape7.lineTo(405.6, 663.3);
        shape7.lineTo(400.2, 662.5);
        shape7.lineTo(405.6, 640.7);
        shape7.lineTo(407.6, 623.7);
        shape7.lineTo(391.2, 637.1);
        shape7.lineTo(380, 664.7);
        shape7.lineTo(375.8, 687.7);
        shape7.lineTo(369, 706.5);
        shape7.lineTo(369, 718.1);
        shape7.lineTo(366.8, 737.9);
        shape7.lineTo(360.4, 767.7);
        shape7.lineTo(352.8, 800.5);
        shape7.lineTo(341.6, 826.1);
        shape7.lineTo(347.2, 801.9);
        shape7.lineTo(352.8, 776.9);
        shape7.lineTo(357, 753.3);
        shape7.lineTo(359.6, 717.3);
        shape7.lineTo(356.6, 711.5);
        shape7.lineTo(356.6, 677.5);
        shape7.lineTo(335.4, 694.7);
        shape7.lineTo(346.6, 669.9);
        shape7.lineTo(357.8, 648.1);
        shape7.lineTo(350.2, 643.5);
        shape7.lineTo(332, 663.3);
        shape7.lineTo(310.4, 703.5);
        shape7.lineTo(283.6, 785.9);
        shape7.lineTo(279, 772.1);
        shape7.curveTo(286.364, 751.019, 289.148, 739.196, 292.2, 718.1);
        shape7.lineTo(273.2, 722.7);
        shape7.curveTo(264.857, 739.115, 259.095, 748.015, 246, 763.1);
        shape7.lineTo(232.2, 766.9);
        shape7.lineTo(228.2, 759.9);
        shape7.lineTo(223.4, 759.9);
        shape7.lineTo(210.8, 750.3);
        shape7.lineTo(201, 753.7);
        shape7.curveTo(194.23, 767.792, 189.001, 774.866, 175.2, 784.9);
        shape7.closePath();
        g2d.setPaint(Color.decode("#DEE1E1"));
        g2d.fill(shape7);

        GeneralPath shape8 = new GeneralPath();
        shape8.moveTo(434.6, 617.1);
        shape8.lineTo(428.2, 632.1);
        shape8.lineTo(428.2, 648.1);
        shape8.lineTo(434.6, 640.7);
        shape8.lineTo(434.6, 617.1);
        shape8.closePath();
        g2d.setPaint(Color.decode("#DBE0E1"));
        g2d.fill(shape8);
        
        GeneralPath shape9 = new GeneralPath();
        shape9.moveTo(268.0, 888.5);
        shape9.lineTo(253.8, 900.3);
        shape9.lineTo(376.6, 900.3);
        shape9.lineTo(356.2, 895.9);
        shape9.lineTo(351.0, 882.5);
        shape9.curveTo(345.647, 883.33, 342.867, 884.285, 338.4, 887.1);
        shape9.lineTo(335.2, 899.1);
        shape9.curveTo(328.279, 897.306, 325.005, 895.099, 319.4, 890.7);
        shape9.lineTo(306.6, 854.1);
        shape9.curveTo(305.971, 843.096, 304.6, 837.004, 300.0, 826.3);
        shape9.curveTo(293.854, 834.023, 292.503, 839.387, 291.2, 849.5);
        shape9.lineTo(289.0, 883.7);
        shape9.lineTo(281.6, 891.7);
        shape9.lineTo(276.8, 864.1);
        shape9.curveTo(271.78, 854.338, 267.514, 850.549, 258.6, 845.3);
        shape9.curveTo(263.266, 862.106, 265.844, 871.531, 268.0, 888.5);
        shape9.closePath();
        g2d.setPaint(Color.decode("#B0B3B2"));
        g2d.fill(shape9);

        GeneralPath shape10 = new GeneralPath();
        shape10.moveTo(1039.0, 898.1);
        shape10.lineTo(1039.0, 900.9);
        shape10.lineTo(940.2, 900.5);
        shape10.lineTo(936.2, 891.1);
        shape10.lineTo(911.8, 876.3);
        shape10.lineTo(902.8, 861.3);
        shape10.lineTo(896.8, 841.9);
        shape10.lineTo(881.4, 805.5);
        shape10.lineTo(878.2, 781.9);
        shape10.lineTo(869.6, 758.1);
        shape10.curveTo(865.606, 748.466, 864.346, 742.838, 863.4, 732.5);
        shape10.lineTo(858.6, 719.9);
        shape10.lineTo(858.6, 709.5);
        shape10.curveTo(857.363, 695.339, 855.917, 687.5, 852.0, 673.7);
        shape10.lineTo(838.0, 643.7);
        shape10.lineTo(841.2, 624.9);
        shape10.lineTo(851.0, 635.9);
        shape10.curveTo(855.422, 640.165, 857.755, 642.776, 860.4, 649.7);
        shape10.lineTo(865.2, 670.7);
        shape10.lineTo(869.6, 707.1);
        shape10.lineTo(875.4, 708.5);
        shape10.lineTo(875.4, 684.5);
        shape10.lineTo(874.6, 654.9);
        shape10.curveTo(874.666, 652.354, 875.084, 651.157, 879.6, 651.3);
        shape10.lineTo(891.2, 658.9);
        shape10.curveTo(899.442, 665.877, 903.744, 669.995, 908.4, 679.3);
        shape10.lineTo(904.0, 700.9);
        shape10.lineTo(914.8, 729.3);
        shape10.lineTo(917.6, 764.3);
        shape10.lineTo(925.4, 814.3);
        shape10.lineTo(930.6, 833.3);
        shape10.lineTo(930.8, 852.7);
        shape10.lineTo(935.0, 872.1);
        shape10.lineTo(938.0, 858.9);
        shape10.lineTo(932.4, 823.1);
        shape10.lineTo(932.4, 785.7);
        shape10.lineTo(946.8, 756.1);
        shape10.lineTo(952.2, 752.3);
        shape10.lineTo(955.6, 762.9);
        shape10.lineTo(955.6, 769.9);
        shape10.lineTo(952.2, 809.3);
        shape10.lineTo(955.6, 842.9);
        shape10.lineTo(963.0, 805.7);
        shape10.lineTo(972.2, 761.7);
        shape10.lineTo(975.2, 733.1);
        shape10.curveTo(977.57, 732.901, 978.75, 733.325, 980.6, 735.1);
        shape10.lineTo(981.2, 754.9);
        shape10.lineTo(989.0, 760.3);
        shape10.lineTo(992.2, 783.5);
        shape10.curveTo(993.875, 806.703, 994.239, 819.708, 993.6, 842.9);
        shape10.curveTo(995.252, 862.582, 995.564, 873.618, 993.6, 893.3);
        shape10.lineTo(1000.8, 898.1);
        shape10.lineTo(1002.4, 840.3);
        shape10.lineTo(1007.6, 832.5);
        shape10.curveTo(1010.1, 829.435, 1011.28, 829.37, 1013.0, 832.5);
        shape10.lineTo(1024.4, 892.1);
        shape10.lineTo(1039.0, 898.1);
        shape10.closePath();
        g2d.setPaint(Color.decode("#B4B4B0"));
        g2d.fill(shape10);
        
        GeneralPath shape11 = new GeneralPath();
        shape11.moveTo(956.4, 733.5);
        shape11.lineTo(951.0, 744.7);
        shape11.lineTo(958.6, 748.7);
        shape11.lineTo(956.4, 733.5);
        shape11.closePath();
        g2d.setPaint(Color.decode("#B4B4B0"));
        g2d.fill(shape11);

        GeneralPath shape12 = new GeneralPath();
        shape12.moveTo(947.4, 694.1);
        shape12.curveTo(945.282, 689.621, 943.435, 687.433, 939.8, 683.7);
        shape12.lineTo(930.2, 694.9);
        shape12.curveTo(929.631, 704.485, 929.839, 709.732, 931.0, 718.9);
        shape12.lineTo(925.8, 727.9);
        shape12.curveTo(924.768, 738.049, 923.655, 743.743, 921.2, 753.9);
        shape12.lineTo(928.4, 785.3);
        shape12.lineTo(932.0, 764.1);
        shape12.curveTo(937.517, 751.652, 939.357, 744.631, 942.4, 732.1);
        shape12.lineTo(941.6, 723.1);
        shape12.curveTo(942.682, 711.715, 943.816, 705.36, 947.4, 694.1);
        shape12.closePath();
        g2d.setPaint(Color.decode("#B6B8B3"));
        g2d.fill(shape12);

        GeneralPath shape13 = new GeneralPath();
        shape13.moveTo(713.6, 760.3);
        shape13.lineTo(701.8, 776.5);
        shape13.lineTo(721.4, 761.3);
        shape13.lineTo(739.0, 729.3);
        shape13.lineTo(748.4, 704.3);
        shape13.lineTo(737.8, 728.1);
        shape13.lineTo(719.8, 755.1);
        shape13.lineTo(713.6, 760.3);
        shape13.closePath();
        g2d.setPaint(Color.decode("#B7B7B4"));
        g2d.fill(shape13);

        GeneralPath shape14 = new GeneralPath();
        shape14.moveTo(705.0, 887.5);
        shape14.lineTo(699.8, 899.7);
        shape14.lineTo(711.6, 887.5);
        shape14.lineTo(717.6, 858.1);
        shape14.lineTo(707.6, 871.3);
        shape14.lineTo(705.0, 887.5);
        shape14.closePath();
        g2d.setPaint(Color.decode("#D9DEE1"));
        g2d.fill(shape14);

        GeneralPath shape15 = new GeneralPath();
        shape15.moveTo(780.4, 611.7);
        shape15.lineTo(759.6, 628.7);
        shape15.lineTo(761.8, 650.9);
        shape15.lineTo(755.6, 677.1);
        shape15.lineTo(755.6, 712.7);
        shape15.lineTo(725.8, 763.7);
        shape15.curveTo(706.324, 781.14, 696.192, 791.437, 681.0, 811.7);
        shape15.lineTo(683.6, 832.7);
        shape15.lineTo(689.0, 836.7);
        shape15.curveTo(696.26, 828.439, 700.693, 823.869, 710.8, 816.1);
        shape15.lineTo(722.2, 819.5);
        shape15.curveTo(737.384, 812.809, 742.908, 804.129, 753.4, 789.7);
        shape15.lineTo(753.4, 777.1);
        shape15.curveTo(762.598, 763.471, 767.141, 747.408, 774.8, 712.7);
        shape15.curveTo(779.393, 684.855, 781.358, 669.167, 782.6, 640.9);
        shape15.lineTo(780.4, 611.7);
        shape15.closePath();
        g2d.setPaint(Color.decode("#BAA898"));
        g2d.fill(shape15);

        GeneralPath shape16 = new GeneralPath(); // SHIRT SHADOW
        shape16.moveTo(513.6, 550.9);
        shape16.curveTo(519.091, 548.495, 521.733, 548.666, 525.2, 553.3);
        shape16.lineTo(525.4, 634.1);
        shape16.curveTo(524.647, 636.375, 523.577, 636.772, 520.8, 636.3);
        shape16.curveTo(515.457, 627.225, 513.687, 621.729, 511.8, 611.5);
        shape16.lineTo(497.6, 607.9);
        shape16.curveTo(496.114, 606.698, 496.128, 605.927, 496.6, 604.5);
        shape16.lineTo(500, 596.3);
        shape16.lineTo(499, 575.1);
        shape16.lineTo(496.6, 573.9);
        shape16.lineTo(504, 557.5);
        shape16.lineTo(513.6, 550.9);
        shape16.closePath();
        g2d.setPaint(Color.decode("#DCE0E1"));
        g2d.fill(shape16);
        // END SHIRT
        
        // START EAR
        GeneralPath shape17 = new GeneralPath(); // EAR
        shape17.moveTo(464.8, 433.1);
        shape17.curveTo(460.32, 409.896, 460.626, 397.054, 470.4, 374.7);
        shape17.lineTo(517.6, 366.5);
        shape17.lineTo(536.4, 504.5);
        shape17.lineTo(502.8, 507.5);
        shape17.lineTo(492.4, 488.5);
        shape17.curveTo(479.246, 467.483, 472.357, 455.573, 464.8, 433.1);
        shape17.closePath();
        g2d.setPaint(Color.decode("#BBA597"));
        g2d.fill(shape17);

        GeneralPath shape18 = new GeneralPath(); // EAR
        shape18.moveTo(470.0, 393.7);
        shape18.lineTo(464.4, 392.7);
        shape18.lineTo(463.6, 375.1);
        shape18.lineTo(516.4, 372.7);
        shape18.lineTo(509.0, 457.9);
        shape18.lineTo(498.6, 456.5);
        shape18.curveTo(492.97, 450.835, 490.319, 447.488, 486.8, 441.1);
        shape18.curveTo(485.288, 436.414, 485.56, 433.786, 486.8, 429.1);
        shape18.lineTo(491.6, 424.1);
        shape18.lineTo(484.0, 421.9);
        shape18.lineTo(487.8, 416.1);
        shape18.lineTo(488.4, 410.9);
        shape18.curveTo(484.887, 407.561, 482.69, 406.691, 478.6, 405.9);
        shape18.curveTo(474.908, 410.308, 473.612, 413.055, 472.8, 418.5);
        shape18.curveTo(474.825, 420.185, 475.193, 421.333, 475.4, 423.5);
        shape18.curveTo(475.287, 429.045, 474.161, 431.488, 471.6, 435.5);
        shape18.curveTo(466.864, 427.035, 465.534, 421.736, 463.6, 412.1);
        shape18.curveTo(464.798, 406.834, 466.014, 404.181, 469.0, 399.9);
        shape18.lineTo(470.0, 393.7);
        shape18.closePath();
        g2d.setPaint(Color.decode("#A37B68"));
        g2d.fill(shape18);

        GeneralPath shape19 = new GeneralPath(); // HAIR BELOW EAR
        shape19.moveTo(520.0, 542.3);
        shape19.curveTo(499.119, 525.601, 492.493, 512.063, 488.0, 481.9);
        shape19.curveTo(493.211, 490.627, 496.352, 495.474, 507.8, 502.9);
        shape19.curveTo(512.168, 504.373, 514.936, 504.316, 521.0, 501.1);
        shape19.lineTo(529.2, 528.1);
        shape19.lineTo(524.2, 540.9);
        shape19.curveTo(522.812, 542.202, 521.868, 542.437, 520.0, 542.3);
        shape19.closePath();
        g2d.setPaint(Color.decode("#492D26"));
        g2d.fill(shape19);

        GeneralPath shape20 = new GeneralPath(); // EAR
        shape20.moveTo(473.6, 392.1);
        shape20.lineTo(478.0, 389.7);
        shape20.lineTo(513.8, 376.1);
        shape20.curveTo(509.991, 389.176, 507.427, 396.479, 505.8, 409.7);
        shape20.lineTo(501.2, 412.7);
        shape20.lineTo(498.2, 419.7);
        shape20.lineTo(492.8, 421.9);
        shape20.lineTo(495.0, 415.3);
        shape20.curveTo(494.482, 410.832, 493.888, 408.335, 492.0, 403.9);
        shape20.curveTo(485.657, 402.799, 482.182, 400.923, 476.0, 397.3);
        shape20.lineTo(473.6, 392.1);
        shape20.closePath();
        g2d.setPaint(Color.decode("#7A5649"));
        g2d.fill(shape20);
        
        GeneralPath shape21 = new GeneralPath(); // EAR
        shape21.moveTo(477.0, 427.1);
        shape21.lineTo(482.4, 422.3);
        shape21.curveTo(480.267, 430.119, 479.66, 434.441, 481.0, 441.9);
        shape21.curveTo(487.018, 450.416, 491.653, 454.444, 499.8, 461.7);
        shape21.lineTo(494.6, 463.1);
        shape21.lineTo(486.8, 459.5);
        shape21.lineTo(485.2, 462.3);
        shape21.lineTo(491.2, 470.3);
        shape21.curveTo(494.365, 472.031, 496.159, 472.938, 499.8, 473.1);
        shape21.curveTo(502.357, 472.14, 503.574, 471.33, 505.6, 469.7);
        shape21.lineTo(517.0, 480.7);
        shape21.lineTo(509.6, 498.9);
        shape21.curveTo(498.201, 492.623, 493.423, 486.647, 486.8, 473.1);
        shape21.curveTo(480.843, 461.95, 477.661, 455.695, 473.8, 444.5);
        shape21.curveTo(474.267, 437.72, 474.981, 433.912, 477.0, 427.1);
        shape21.closePath();
        g2d.setPaint(Color.decode("#CFD3D2"));
        g2d.fill(shape21);

        GeneralPath shape22 = new GeneralPath(); // EAR
        shape22.moveTo(512.4, 458.9);
        shape22.lineTo(502.8, 461.3);
        shape22.curveTo(505.003, 464.87, 506.58, 466.245, 510.6, 466.5);
        shape22.lineTo(512.4, 458.9);
        shape22.closePath();
        g2d.setPaint(Color.decode("#CFD3D2"));
        g2d.fill(shape22);

        GeneralPath shape23 = new GeneralPath(); // EAR
        shape23.moveTo(495.8, 430.1);
        shape23.curveTo(498.914, 425.303, 499.984, 422.466, 501.4, 417.3);
        shape23.curveTo(503.265, 416.658, 503.837, 417.213, 504.6, 418.7);
        shape23.curveTo(503.978, 422.883, 503.882, 425.21, 504.6, 429.3);
        shape23.curveTo(503.762, 430.669, 503.174, 431.254, 502.0, 432.1);
        shape23.curveTo(501.447, 436.212, 501.756, 438.355, 502.6, 442.1);
        shape23.curveTo(502.944, 445.609, 502.76, 447.543, 501.4, 450.9);
        shape23.curveTo(498.991, 452.167, 497.729, 452.19, 495.8, 449.7);
        shape23.curveTo(493.458, 446.907, 492.925, 444.965, 492.8, 441.1);
        shape23.curveTo(493.193, 436.614, 493.916, 434.221, 495.8, 430.1);
        shape23.closePath();
        g2d.setPaint(Color.decode("#955F4B"));
        g2d.fill(shape23);
        // END EAR
        
        // START FACE
        GeneralPath shape24 = new GeneralPath(); // FOREHEAD
        shape24.moveTo(825.8, 380.9);
        shape24.lineTo(513.8, 361.7);
        shape24.lineTo(513.8, 336.3);
        shape24.lineTo(586.2, 167.1);
        shape24.lineTo(809.6, 162.9);
        shape24.lineTo(847.8, 343.5);
        shape24.lineTo(839.0, 346.1);
        shape24.lineTo(825.8, 380.9);
        shape24.closePath();
        g2d.setPaint(Color.decode("#7A5649"));
        g2d.fill(shape24);
        
        GeneralPath shape25 = new GeneralPath(); // FACE
        shape25.moveTo(704, 398.3);
        shape25.lineTo(753.4, 412.1);
        shape25.lineTo(744.2, 350.5);
        shape25.curveTo(746.761, 342.421, 748.905, 337.844, 755.4, 329.5);
        shape25.curveTo(766.563, 324.532, 772.152, 321.108, 781.6, 314.5);
        shape25.curveTo(793.73, 313.779, 800.534, 313.228, 812.6, 316.3);
        shape25.curveTo(815.947, 314.376, 816.886, 312.918, 817.0, 309.7);
        shape25.lineTo(801.4, 290.1);
        shape25.curveTo(783.203, 280.385, 773.341, 274.151, 757.2, 259.7);
        shape25.curveTo(737.557, 250.181, 728.38, 244.703, 717.6, 234.5);
        shape25.curveTo(714.16, 228.602, 711.477, 229.88, 706.8, 231.5);
        shape25.lineTo(693.4, 259.7);
        shape25.curveTo(690.141, 252.679, 687.519, 248.895, 681.0, 242.5);
        shape25.curveTo(677.469, 245.585, 675.37, 246.99, 670.6, 246.7);
        shape25.lineTo(670.6, 264.9);
        shape25.curveTo(674.869, 284.268, 678.415, 292.256, 687.8, 298.9);
        shape25.lineTo(699.2, 316.3);
        shape25.lineTo(704, 398.3);
        shape25.closePath();
        g2d.setPaint(Color.decode("#AA7C62"));
        g2d.fill(shape25);

        GeneralPath shape26 = new GeneralPath(); // FACE (whole below)
        shape26.moveTo(510.8, 382.3);
        shape26.lineTo(522.8, 360.7);
        shape26.lineTo(550.2, 326.9);
        shape26.lineTo(722.6, 408.3);
        shape26.lineTo(836.4, 440.9);
        shape26.lineTo(847.2, 428.5);
        shape26.curveTo(850.012, 432.564, 850.642, 435.219, 849.4, 440.9);
        shape26.curveTo(850.227, 453.268, 849.653, 459.226, 847.2, 468.5);
        shape26.lineTo(841.6, 499.9);
        shape26.curveTo(837.986, 515.538, 835.216, 524.17, 828.8, 539.3);
        shape26.curveTo(823.314, 555.113, 818.163, 563.569, 806.2, 578.1);
        shape26.curveTo(797.354, 589.592, 791.035, 596.24, 773.6, 609.9);
        shape26.curveTo(764.141, 618.66, 754.446, 624.203, 728.8, 635.3);
        shape26.curveTo(713.132, 640.347, 703.542, 640.651, 686.0, 640.1);
        shape26.curveTo(672.42, 638.678, 666.284, 635.763, 655.8, 629.9);
        shape26.lineTo(591.0, 601.1);
        shape26.curveTo(573.795, 593.095, 565.392, 587.168, 552.4, 574.3);
        shape26.lineTo(528.2, 543.7);
        shape26.curveTo(523.467, 533.594, 521.605, 527.718, 519.6, 516.9);
        shape26.lineTo(512.6, 492.9);
        shape26.lineTo(507.2, 470.9);
        shape26.lineTo(507.2, 453.7);
        shape26.lineTo(510.8, 382.3);
        shape26.closePath();
        g2d.setPaint(Color.decode("#BBA999"));
        g2d.fill(shape26);

        GeneralPath shape27 = new GeneralPath(); // FACE
        shape27.moveTo(605, 435.5);
        shape27.curveTo(602.864, 430.444, 601.093, 427.393, 597.8, 421.9);
        shape27.lineTo(623.8, 407.3);
        shape27.lineTo(762.8, 414.1);
        shape27.lineTo(819.4, 439.9);
        shape27.lineTo(815.8, 454.3);
        shape27.curveTo(807.371, 456.128, 802.711, 457.089, 793.8, 456.9);
        shape27.curveTo(785.915, 466.689, 783.192, 473.254, 780.4, 486.1);
        shape27.lineTo(784.8, 509.3);
        shape27.lineTo(792.0, 531.9);
        shape27.curveTo(793.814, 541.448, 793.319, 546.981, 792.0, 556.9);
        shape27.curveTo(789.432, 565.891, 787.558, 569.803, 783.2, 574.1);
        shape27.curveTo(779.953, 577.561, 777.708, 577.517, 773.2, 575.1);
        shape27.curveTo(770.693, 572.67, 769.755, 571.141, 768.4, 568.3);
        shape27.curveTo(763.74, 560.906, 761.669, 556.601, 762.8, 547.5);
        shape27.lineTo(756.0, 544.9);
        shape27.lineTo(659.6, 516.9);
        shape27.lineTo(650.2, 549.7);
        shape27.curveTo(649.982, 552.699, 649.359, 554.323, 647.2, 557.1);
        shape27.curveTo(641.085, 564.029, 637.048, 567.416, 623.8, 568.5);
        shape27.curveTo(617.833, 568.952, 614.957, 567.698, 610.6, 562.9);
        shape27.curveTo(609.376, 558.423, 609.375, 555.801, 610.6, 550.9);
        shape27.curveTo(611.62, 543.319, 613.355, 539.072, 617.4, 531.5);
        shape27.lineTo(627.8, 494.5);
        shape27.curveTo(634.826, 479.125, 638.842, 467.86, 645.6, 461.7);
        shape27.curveTo(646.006, 459.548, 645.722, 458.369, 644.6, 456.3);
        shape27.curveTo(649.65, 451.903, 650.988, 448.69, 653.346, 443.03);
        shape27.lineTo(653.4, 442.9);
        shape27.lineTo(644.6, 437.9);
        shape27.lineTo(632.4, 438.503);
        shape27.curveTo(621.344, 438.503, 615.381, 437.812, 605.0, 435.5);
        shape27.closePath();
        g2d.setPaint(Color.decode("#AA7B61"));
        g2d.fill(shape27);

        GeneralPath shape28 = new GeneralPath(); // FACE
        shape28.moveTo(525.6, 343.3);
        shape28.curveTo(525.41, 346.385, 525.748, 347.967, 527.8, 350.3);
        shape28.lineTo(547.008, 323.155);
        shape28.lineTo(559.572, 310.49);
        shape28.lineTo(588.6, 297.3);
        shape28.curveTo(598.792, 294.725, 604.409, 292.758, 614.4, 289.1);
        shape28.curveTo(617.69, 277.555, 619.418, 271.081, 620, 259.5);
        shape28.curveTo(625.805, 250.477, 628.117, 245.392, 631.4, 236.3);
        shape28.curveTo(631.621, 233.514, 631.458, 231.985, 630.8, 229.3);
        shape28.lineTo(630.8, 225.7);
        shape28.curveTo(634.178, 226.014, 635.857, 225.527, 638.8, 224.5);
        shape28.curveTo(641.187, 222.118, 642.181, 220.719, 642.2, 217.9);
        shape28.lineTo(638.8, 209.5);
        shape28.lineTo(635.6, 217.1);
        shape28.lineTo(622.6, 227.1);
        shape28.lineTo(622.2, 228.3);
        shape28.lineTo(616.8, 239.1);
        shape28.lineTo(600.2, 266.7);
        shape28.lineTo(578.2, 282.5);
        shape28.lineTo(572.4, 283.5);
        shape28.lineTo(567, 287.7);
        shape28.lineTo(560.8, 298.5);
        shape28.curveTo(547.721, 310.432, 540.746, 317.387, 529.8, 330.9);
        shape28.curveTo(527.711, 335.502, 526.733, 338.184, 525.6, 343.3);
        shape28.closePath();
        g2d.setPaint(Color.decode("#99796A"));
        g2d.fill(shape28);

        GeneralPath shape29 = new GeneralPath(); // FACE
        shape29.moveTo(532, 333.7);
        shape29.lineTo(528.2, 348.9);
        shape29.lineTo(550, 322.9);
        shape29.lineTo(577.2, 318.1);
        shape29.curveTo(577.518, 315.763, 577.427, 314.51, 576.2, 312.5);
        shape29.lineTo(586.4, 302.5);
        shape29.lineTo(600.2, 294.9);
        shape29.curveTo(603.203, 292.704, 604.661, 291.394, 606.8, 288.9);
        shape29.curveTo(607.697, 286.176, 607.683, 284.688, 606.8, 282.1);
        shape29.curveTo(603.156, 280.13, 600.795, 279.813, 596.4, 279.7);
        shape29.lineTo(578.2, 290.1);
        shape29.lineTo(569.8, 303.9);
        shape29.lineTo(560, 306.3);
        shape29.curveTo(554.414, 311.624, 550.693, 314.397, 542.8, 318.9);
        shape29.lineTo(532, 333.7);
        shape29.closePath();
        g2d.setPaint(Color.decode("#BBA597"));
        g2d.fill(shape29);

        GeneralPath shape30 = new GeneralPath(); // FACE
        shape30.moveTo(639, 260.9);
        shape30.curveTo(627.059, 273.799, 620.906, 280.758, 620.4, 287.9);
        shape30.curveTo(634.36, 292.061, 642.079, 293.706, 655.6, 295.3);
        shape30.lineTo(657.8, 293.3);
        shape30.curveTo(654.674, 279.329, 654.831, 270.192, 653.4, 253.9);
        shape30.curveTo(646.794, 256.137, 643.683, 257.691, 639, 260.9);
        shape30.closePath();
        g2d.setPaint(Color.decode("#9F7F6F"));
        g2d.fill(shape30);
        // END FACE
        
        // START LIPS
        GeneralPath shape31 = new GeneralPath(); // LIPS
        shape31.moveTo(630.6, 536.7);
        shape31.curveTo(632.445, 543.08, 636.794, 546.43, 649, 552.1);
        shape31.curveTo(656.329, 548.448, 659.235, 546.065, 664, 541.7);
        shape31.curveTo(665.922, 535.604, 667.035, 532.685, 669.2, 530.1);
        shape31.lineTo(678.6, 522.9);
        shape31.lineTo(720, 524.7);
        shape31.lineTo(743.6, 533.5);
        shape31.curveTo(744.768, 535.082, 745.853, 535.963, 750.4, 537.5);
        shape31.lineTo(750.4, 541.1);
        shape31.curveTo(747.158, 543.548, 744.924, 544.129, 740.8, 544.9);
        shape31.lineTo(699.8, 545.7);
        shape31.curveTo(696.085, 545.819, 694.264, 546.236, 692, 548.3);
        shape31.curveTo(691.386, 549.997, 691.455, 550.871, 692.4, 552.3);
        shape31.curveTo(695.052, 554.404, 697.249, 555.311, 702.8, 556.3);
        shape31.curveTo(709.312, 557.783, 713.071, 558.121, 720, 557.9);
        shape31.curveTo(729.616, 558.519, 734.335, 557.651, 742.2, 555.1);
        shape31.curveTo(750.094, 553.504, 753.623, 551.351, 759.2, 546.5);
        shape31.curveTo(765.666, 537.809, 767.191, 532.134, 767, 520.9);
        shape31.lineTo(759.8, 513.9);
        shape31.lineTo(738.8, 503.1);
        shape31.lineTo(709.6, 502.1);
        shape31.lineTo(683.2, 501.1);
        shape31.lineTo(649, 511.3);
        shape31.curveTo(636.621, 520.503, 636.349, 526.583, 630.6, 536.7);
        shape31.closePath();
        g2d.setPaint(Color.decode("#AF7E62"));
        g2d.fill(shape31);

        GeneralPath shape32 = new GeneralPath(); // LIPS
        shape32.moveTo(715.6, 508.1);
        shape32.lineTo(715, 511.1);
        shape32.lineTo(720, 513.9);
        shape32.lineTo(725.8, 510.3);
        shape32.lineTo(732, 510.3);
        shape32.lineTo(742, 512.1);
        shape32.lineTo(748.8, 516.5);
        shape32.lineTo(752.6, 523.5);
        shape32.lineTo(749.4, 527.9);
        shape32.lineTo(742, 525.7);
        shape32.lineTo(729.2, 521.1);
        shape32.lineTo(715.6, 521.1);
        shape32.lineTo(700.4, 520.3);
        shape32.lineTo(680, 520.3);
        shape32.lineTo(665.2, 521.9);
        shape32.lineTo(670.8, 513.3);
        shape32.lineTo(679.4, 506.9);
        shape32.lineTo(677.8, 504.9);
        shape32.lineTo(662.6, 509.9);
        shape32.lineTo(645.6, 516.5);
        shape32.lineTo(634.4, 506.9);
        shape32.lineTo(629.2, 521.3);
        shape32.lineTo(628.4, 533.1);
        shape32.curveTo(628.723, 535.742, 629.605, 537.178, 631.4, 539.5);
        shape32.curveTo(634.369, 538.72, 635.928, 538.073, 638.4, 536.3);
        shape32.curveTo(639.593, 533.616, 640.055, 532.129, 640.6, 529.5);
        shape32.curveTo(641.351, 528.664, 641.975, 528.336, 643.6, 528.1);
        shape32.curveTo(648.715, 530.527, 651.782, 531.607, 658.4, 531.9);
        shape32.curveTo(661.105, 529.682, 663.22, 528.863, 667.6, 528.1);
        shape32.curveTo(670.652, 526.717, 673.581, 526.182, 681.2, 525.7);
        shape32.curveTo(688.238, 525.567, 692.184, 525.525, 699.2, 526.7);
        shape32.curveTo(707.763, 527.428, 712.562, 527.819, 721.2, 528.9);
        shape32.lineTo(743, 534.1);
        shape32.lineTo(755.2, 538.3);
        shape32.curveTo(759.076, 538.69, 762.071, 541.013, 767.6, 545.1);
        shape32.lineTo(770.8, 546.1);
        shape32.curveTo(772.476, 544.351, 773.356, 543.343, 774.4, 541.3);
        shape32.curveTo(776.008, 536.83, 776.138, 534.494, 775.6, 530.5);
        shape32.lineTo(771.8, 525.5);
        shape32.lineTo(762.6, 525.5);
        shape32.lineTo(757.8, 517.1);
        shape32.lineTo(755.2, 514.3);
        shape32.curveTo(751.988, 513.951, 749.712, 512.623, 745.6, 510.3);
        shape32.curveTo(738.258, 507.763, 734.086, 507.372, 726.6, 507.5);
        shape32.lineTo(722.8, 506.1);
        shape32.curveTo(720.436, 507.123, 718.923, 507.595, 715.6, 508.1);
        shape32.closePath();
        g2d.setPaint(Color.decode("#96523A")); 
        g2d.fill(shape32);

        GeneralPath shape33 = new GeneralPath(); // LIPS
        shape33.moveTo(682, 507.3);
        shape33.lineTo(678.2, 511.3);
        shape33.curveTo(682.518, 512.673, 685.201, 512.463, 690.2, 511.3);
        shape33.lineTo(692.8, 508.5);
        shape33.curveTo(687.805, 509.333, 685.355, 509.215, 682, 507.3);
        shape33.closePath();
        g2d.setPaint(Color.decode("#B68E80"));
        g2d.fill(shape33);

        GeneralPath shape34 = new GeneralPath(); // LIPS
        shape34.moveTo(724.8, 527.7);
        shape34.curveTo(720.514, 525.086, 717.758, 524.366, 712.0, 524.9);
        shape34.lineTo(717.4, 527.1);
        shape34.curveTo(720.882, 527.874, 722.327, 527.846, 724.8, 527.7);
        g2d.setPaint(Color.decode("#842F25"));
        g2d.fill(shape34);

        GeneralPath shape35 = new GeneralPath(); // LIPS
        shape35.moveTo(670, 532.9);
        shape35.curveTo(670.439, 530.627, 671.072, 529.469, 673.2, 527.7);
        shape35.curveTo(680.776, 526.708, 685.024, 526.8, 692.6, 527.7);
        shape35.lineTo(708.4, 530.7);
        shape35.curveTo(710.897, 532.705, 712.656, 533.441, 716.4, 534.1);
        shape35.lineTo(716.4, 537.5);
        shape35.curveTo(711.862, 537.825, 709.315, 538.25, 704.8, 536.9);
        shape35.curveTo(704.999, 537.956, 704.583, 538.454, 703.6, 539.3);
        shape35.curveTo(692.959, 539.255, 687.087, 538.77, 676.8, 536.9);
        shape35.curveTo(673.438, 535.854, 672.001, 534.94, 670, 532.9);
        shape35.closePath();
        g2d.setPaint(Color.decode("#CFC0BB"));
        g2d.fill(shape35);
        // END LIPS
        
        // START EYES
        GeneralPath shape36 = new GeneralPath(); // LIPS
        shape36.moveTo(635, 517.7);
        shape36.curveTo(633.5, 519.22, 633.035, 520.413, 632.6, 522.9);
        shape36.curveTo(633.15, 524.656, 633.782, 525.526, 635.4, 526.9);
        shape36.curveTo(637.531, 526.086, 637.987, 525.444, 638.799, 524.301);
        shape36.lineTo(638.8, 524.3);
        shape36.lineTo(642, 524.3);
        shape36.lineTo(647.6, 526.9);
        shape36.lineTo(650.8, 525.7);
        shape36.curveTo(652.632, 526.111, 653.516, 526.036, 655, 525.7);
        shape36.curveTo(655.958, 524.876, 656.016, 524.339, 655.6, 523.3);
        shape36.curveTo(651.948, 520.667, 649.603, 519.43, 645.2, 517.7);
        shape36.curveTo(641.293, 517.308, 639.084, 517.185, 635, 517.7);
        shape36.closePath();
        g2d.setPaint(Color.decode("#702E23"));
        g2d.fill(shape36);

        GeneralPath shape37 = new GeneralPath(); // LIPS
        shape37.moveTo(759.8, 535.5);
        shape37.curveTo(757.752, 532.994, 757.24, 531.496, 757.2, 528.7);
        shape37.curveTo(758.373, 527.809, 759.26, 527.557, 761.4, 527.7);
        shape37.lineTo(766.6, 530.5);
        shape37.curveTo(766.481, 532.207, 766, 533.091, 764.2, 534.5);
        shape37.curveTo(762.659, 535.141, 761.683, 535.34, 759.8, 535.5);
        shape37.closePath();
        g2d.setPaint(Color.decode("#752D21"));
        g2d.fill(shape37);

        GeneralPath shape38 = new GeneralPath(); // LIPS
        shape38.moveTo(697.2, 505.1);
        shape38.lineTo(696.8, 507.7);
        shape38.curveTo(698.678, 508.282, 699.634, 508.756, 701, 510.1);
        shape38.curveTo(703.204, 510.102, 704.038, 509.879, 705.2, 509.3);
        shape38.curveTo(704.565, 506.261, 702.773, 505.37, 697.2, 505.1);
        shape38.closePath();
        g2d.setPaint(Color.decode("#A05A46"));
        g2d.fill(shape38);
        // END LIPS
        
        // START NOSE
        GeneralPath shape39 = new GeneralPath(); // NOSE
        shape39.moveTo(745.0, 473.3);
        shape39.curveTo(725.581, 468.777, 714.531, 467.553, 694.4, 468.7);
        shape39.lineTo(673.2, 461.9);
        shape39.lineTo(675.6, 452.1);
        shape39.lineTo(696.6, 427.5);
        shape39.lineTo(749.6, 416.1);
        shape39.curveTo(755.425, 427.508, 758.349, 433.988, 768.6, 444.3);
        shape39.curveTo(769.044, 450.776, 768.421, 454.158, 767.0, 460.1);
        shape39.curveTo(762.292, 468.525, 758.056, 471.905, 745.0, 473.3);
        g2d.setPaint(Color.decode("#AF7E62"));
        g2d.fill(shape39);

        GeneralPath shape40 = new GeneralPath(); // LEFT NOSTRIL (below)
        shape40.moveTo(691.2, 452.9);
        shape40.curveTo(688.604, 453.998, 687.365, 454.731, 686.0, 456.5);
        shape40.curveTo(686.26, 457.258, 686.313, 457.711, 687.8, 458.1);
        shape40.curveTo(691.99, 457.172, 694.45, 456.836, 699.0, 456.5);
        shape40.curveTo(701.952, 455.127, 703.799, 454.751, 707.2, 454.3);
        shape40.lineTo(709.2, 452.1);
        shape40.curveTo(701.199, 450.265, 697.31, 450.548, 691.2, 452.9);
        g2d.setPaint(Color.decode("#965138"));
        g2d.fill(shape40);
        
        GeneralPath shape41 = new GeneralPath(); // RIGHT NOSTRIL (below)
        shape41.moveTo(744.6, 462.5);
        shape41.curveTo(741.899, 460.909, 740.364, 460.037, 737.6, 458.5);
        shape41.lineTo(749.0, 458.5);
        shape41.curveTo(749.42, 459.461, 749.498, 460.024, 749.2, 461.1);
        shape41.curveTo(747.878, 462.082, 746.808, 462.33, 744.6, 462.5);
        g2d.setPaint(Color.decode("#965138"));
        g2d.fill(shape41);

        GeneralPath shape42 = new GeneralPath(); // LEFT NOSTRIL (above) 
        shape42.moveTo(700.8, 447.7);
        shape42.lineTo(687.8, 453.9);
        shape42.lineTo(699.4, 453.9);
        shape42.curveTo(702.682, 452.177, 704.107, 451.469, 709.0, 452.1);
        shape42.lineTo(700.8, 447.7);
        g2d.setPaint(Color.decode("#7B3828"));
        g2d.fill(shape42);

        GeneralPath shape43 = new GeneralPath(); // RIGHT NOSTRIL (above)
        shape43.moveTo(738.0, 455.5); 
        shape43.curveTo(737.158, 456.661, 736.925, 457.317, 737.2, 458.5);
        shape43.curveTo(741.434, 459.553, 743.899, 459.819, 748.4, 459.9);
        shape43.curveTo(749.594, 459.609, 749.769, 459.271, 749.6, 458.5);
        shape43.curveTo(749.23, 457.077, 748.768, 456.434, 747.6, 455.5);
        shape43.curveTo(743.85, 454.744, 741.751, 454.685, 738.0, 455.5);
        g2d.setPaint(Color.decode("#7B3828"));
        g2d.fill(shape43);

        GeneralPath shape44 = new GeneralPath(); // NOSE
        shape44.moveTo(663.6, 436.1);
        shape44.curveTo(663.356, 432.35, 662.833, 430.205, 661.2, 426.3);
        shape44.lineTo(672.6, 420.5);
        shape44.lineTo(685.2, 425.3);
        shape44.lineTo(669.6, 455.7);
        shape44.curveTo(678.415, 460.132, 683.454, 462.584, 700.2, 464.3);
        shape44.lineTo(700.2, 468.3);
        shape44.curveTo(695.844, 470.427, 692.965, 471.13, 687.4, 471.9);
        shape44.curveTo(678.319, 469.775, 673.804, 467.561, 666.6, 462.1);
        shape44.curveTo(662.516, 457.173, 660.901, 453.541, 659.4, 445.3);
        shape44.curveTo(660.346, 441.704, 660.964, 439.688, 663.6, 436.1);
        g2d.setPaint(Color.decode("#915844"));
        g2d.fill(shape44);

        GeneralPath shape45 = new GeneralPath(); // NOSE
        shape45.moveTo(673.0, 425.1);
        shape45.curveTo(671.329, 423.574, 671.0, 422.745, 671.2, 421.3);
        shape45.lineTo(683.4, 410.1);
        shape45.lineTo(699.4, 373.3);
        shape45.lineTo(715.0, 379.3);
        shape45.lineTo(687.6, 426.5);
        shape45.curveTo(681.918, 427.116, 678.724, 426.962, 673.0, 425.1);
        g2d.setPaint(Color.decode("#A3745E"));
        g2d.fill(shape45);

        GeneralPath shape46 = new GeneralPath(); // NOSE
        shape46.moveTo(722.8, 354.5);
        shape46.curveTo(714.801, 354.233, 710.479, 355.071, 703, 357.9);
        shape46.lineTo(699.2, 375.5);
        shape46.curveTo(704.568, 375.365, 707.016, 376.235, 710.6, 379.1);
        shape46.curveTo(710.709, 384.506, 709.541, 387.79, 707.2, 393.7);
        shape46.lineTo(667.8, 446.9);
        shape46.curveTo(667.883, 450.381, 668.175, 452.346, 669.6, 455.9);
        shape46.curveTo(673.077, 458.738, 675.366, 459.51, 680.2, 459.1);
        shape46.curveTo(692.587, 451.632, 699.339, 448.163, 710.6, 444.9);
        shape46.lineTo(715.6, 459.1);
        shape46.curveTo(717.513, 460.718, 718.908, 460.94, 721.6, 460.9);
        shape46.curveTo(729.959, 455.005, 735.193, 452.708, 746, 451.3);
        shape46.curveTo(749.129, 452.665, 750.659, 453.583, 752.4, 455.9);
        shape46.lineTo(755.2, 469.1);
        shape46.curveTo(760.681, 464.218, 763.612, 461.351, 765.2, 452.9);
        shape46.curveTo(763.005, 446.118, 760.967, 442.415, 756.6, 435.9);
        shape46.curveTo(753.852, 424.293, 750.996, 417.757, 746, 406.1);
        shape46.curveTo(741.397, 400.13, 738.747, 396.947, 735.1, 388.7);
        shape46.curveTo(733.555, 381.438, 730.114, 377.81, 724.2, 371.3);
        shape46.curveTo(725.356, 364.526, 725.028, 360.848, 722.8, 354.5);
        g2d.setPaint(Color.decode("#C0A38F"));
        g2d.fill(shape46);

        GeneralPath shape47 = new GeneralPath(); // NOSE
        shape47.moveTo(682.4, 424.3);
        shape47.curveTo(673.72, 431.526, 670.91, 436.234, 668, 445.3);
        shape47.curveTo(667.541, 447.993, 667.955, 449.38, 670.6, 451.5);
        shape47.curveTo(674.538, 451.186, 676.449, 450.737, 679.6, 449.7);
        shape47.curveTo(688.138, 446.34, 691.475, 444.458, 697, 441.1);
        shape47.lineTo(722.8, 429.3);
        shape47.curveTo(732.352, 429.55, 737.069, 428.725, 744.6, 425.9);
        shape47.lineTo(745.8, 421.3);
        shape47.curveTo(745.76, 414.773, 742.036, 408.535, 733.8, 396.3);
        shape47.lineTo(728.4, 392.1);
        shape47.curveTo(725.812, 388.996, 723.868, 387.241, 720, 384.1);
        shape47.curveTo(716.826, 382.125, 715.034, 382.829, 711.885, 384.067);
        shape47.lineTo(711.8, 384.1);
        shape47.lineTo(682.4, 424.3);
        g2d.setPaint(Color.decode("#D4C8C0"));
        g2d.fill(shape47);
        // END NOSE
        
        // START MOUTH
        GeneralPath shape48 = new GeneralPath(); // CHEEK
        shape48.moveTo(528.4, 364.1);
        shape48.lineTo(517.2, 377.1);
        shape48.curveTo(512.671, 396.385, 511.284, 406.597, 509.4, 424.5);
        shape48.curveTo(510.207, 445.951, 510.958, 457.873, 512.4, 479.1);
        shape48.curveTo(514.902, 493.299, 517.076, 501.161, 521.6, 515.1);
        shape48.curveTo(526.209, 529.031, 529.258, 536.73, 535.4, 550.3);
        shape48.curveTo(537.026, 551.53, 538.009, 551.69, 539.8, 551.7);
        shape48.curveTo(544.181, 546.642, 546.342, 543.689, 549.4, 538.1);
        shape48.curveTo(557.831, 531.504, 562.141, 527.633, 568.8, 520.3);
        shape48.curveTo(579.555, 509.044, 584.249, 502.797, 591.6, 491.7);
        shape48.curveTo(601.261, 484.76, 605.647, 480.637, 611.8, 472.9);
        shape48.curveTo(621.256, 463.576, 625.885, 458.202, 633.6, 448.5);
        shape48.curveTo(633.455, 446.619, 632.871, 445.526, 630.8, 443.5);
        shape48.curveTo(616.138, 440.948, 608.621, 439.903, 600.8, 441.1);
        shape48.curveTo(600.121, 430.874, 596.945, 425.831, 588.6, 417.5);
        shape48.lineTo(572.2, 391.3);
        shape48.curveTo(554.32, 377.759, 544.602, 371.328, 528.4, 364.1);
        g2d.setPaint(Color.decode("#CFD3D2"));
        g2d.fill(shape48);

        GeneralPath shape49 = new GeneralPath(); // MOUTH
        shape49.moveTo(706, 478.7);
        shape49.curveTo(690.424, 476.533, 681.758, 473.752, 666.4, 466.7);
        shape49.curveTo(660.302, 479.33, 657.476, 486.471, 653.4, 499.3);
        shape49.curveTo(651.084, 500.56, 650.322, 501.37, 649.4, 502.9);
        shape49.curveTo(647.199, 505.259, 646.913, 506.694, 646.8, 509.3);
        shape49.curveTo(646.497, 511.077, 646.619, 512.016, 647.8, 513.5);
        shape49.lineTo(656.6, 510.1);
        shape49.curveTo(664.615, 506.968, 669.181, 505.588, 677.4, 503.5);
        shape49.curveTo(684.837, 501.987, 689.037, 501.559, 696.6, 501.9);
        shape49.curveTo(710.61, 504.101, 718.626, 504.094, 733, 503.5);
        shape49.curveTo(741.278, 505.519, 745.522, 506.699, 749, 509.3);
        shape49.curveTo(757.764, 513.623, 761.62, 516.532, 766.8, 522.5);
        shape49.lineTo(769.6, 520.7);
        shape49.curveTo(767.853, 516.405, 767.283, 513.914, 766.8, 509.3);
        shape49.curveTo(770.815, 503.161, 772.16, 497.542, 773.2, 484.3);
        shape49.curveTo(767.188, 480.318, 763.484, 479.157, 756.4, 478.7);
        shape49.curveTo(745.722, 477.122, 739.963, 476.869, 731.6, 481.7);
        shape49.lineTo(727.8, 489.9);
        shape49.curveTo(720.582, 490.819, 716.669, 490.848, 710.4, 488.3);
        shape49.curveTo(709.511, 484.738, 708.763, 482.685, 706, 478.7);
        shape49.closePath();
        g2d.setPaint(Color.decode("#BB9982"));
        g2d.fill(shape49);

        GeneralPath shape50 = new GeneralPath(); // MOUTH
        shape50.moveTo(714.8, 495.5);
        shape50.lineTo(711, 499.7);
        shape50.curveTo(714.08, 501.562, 715.736, 501.414, 718.6, 499.7);
        shape50.closePath();
        g2d.setPaint(Color.decode("#CCBBAF"));
        g2d.fill(shape50);

        GeneralPath shape51 = new GeneralPath(); // MOUTH
        shape51.moveTo(678.2, 471.9);
        shape51.curveTo(668.857, 481.97, 664.638, 488.85, 659.4, 503.9);
        shape51.lineTo(665.4, 505.7);
        shape51.curveTo(669.92, 504.161, 672.597, 503.268, 678.2, 501.5);
        shape51.curveTo(683.044, 500.083, 685.992, 499.569, 691.8, 499.3);
        shape51.curveTo(697.058, 500.292, 699.916, 500.319, 704.8, 499.3);
        shape51.curveTo(702.775, 493.349, 701.401, 489.99, 699.6, 483.5);
        shape51.curveTo(690.346, 479.191, 685.777, 476.622, 678.2, 471.9);
        shape51.closePath();
        g2d.setPaint(Color.decode("#D0C5BD"));
        g2d.fill(shape51);
        // END MOUTH
        
        // START HAIR
        GeneralPath shape52 = new GeneralPath(); // HAIR BG - RIGHT
        shape52.moveTo(864.2, 320.1);
        shape52.curveTo(858.441, 331.651, 856.793, 338.015, 854.8, 349.3);
        shape52.lineTo(844.8, 346.7);
        shape52.lineTo(826, 301.9);
        shape52.curveTo(812.386, 288.268, 803.328, 282.934, 787, 273.7);
        shape52.curveTo(785.176, 259.903, 784.132, 252.167, 778.8, 238.3);
        shape52.lineTo(743.8, 214.9);
        shape52.curveTo(727.615, 208.476, 721.874, 203.3, 715.8, 192.1);
        shape52.curveTo(709.312, 211.094, 702.307, 219.3, 687, 231.9);
        shape52.curveTo(683.747, 229.66, 682.867, 228.183, 683.2, 225.1);
        shape52.lineTo(680, 225.1);
        shape52.lineTo(673.2, 239.7);
        shape52.lineTo(663.8, 239.7);
        shape52.lineTo(656.4, 268.1);
        shape52.curveTo(651.302, 243.136, 647.547, 229.16, 637.8, 204.3);
        shape52.lineTo(673.2, 122.9);
        shape52.curveTo(677.044, 119.613, 679.441, 118.35, 683.8, 116.3);
        shape52.curveTo(692.312, 112.1, 697.567, 110.605, 707.6, 109.1);
        shape52.lineTo(752.4, 109.1);
        shape52.curveTo(763.821, 110.81, 769.851, 112.593, 779.8, 117.5);
        shape52.curveTo(793.742, 125.067, 801.315, 130.066, 814.4, 140.3);
        shape52.curveTo(829.066, 152.111, 836.186, 159.502, 846, 174.7);
        shape52.curveTo(855.541, 190.91, 859.762, 200.269, 864.2, 217.7);
        shape52.curveTo(869.83, 237.127, 871.544, 248.029, 870.4, 267.5);
        shape52.curveTo(869.532, 287.764, 868.044, 299.304, 864.2, 320.1);
        shape52.closePath();
        g2d.setPaint(Color.decode("#44322D"));
        g2d.fill(shape52);

        GeneralPath shape53 = new GeneralPath(); // HAIR SHADOW - RIGHT
        shape53.moveTo(808, 207.5);
        shape53.lineTo(800.6, 216.9);
        shape53.lineTo(817.6, 260.5);
        shape53.curveTo(821.055, 277.443, 824.636, 286.532, 833.6, 302.1);
        shape53.lineTo(841, 298.1);
        shape53.curveTo(845.59, 281.002, 848.247, 271.415, 854.4, 254.3);
        shape53.curveTo(849.091, 247.227, 847.518, 242.563, 844.6, 234.3);
        shape53.curveTo(828.852, 225.843, 820.98, 219.779, 808, 207.5);
        shape53.closePath();
        g2d.setPaint(Color.decode("#241A18"));
        g2d.fill(shape53);

        GeneralPath shape54 = new GeneralPath(); // HAIR SHADOW - RIGHT
        shape54.moveTo(711.2, 138.5);
        shape54.curveTo(700.434, 140.791, 694.792, 142.611, 685.8, 147.3);
        shape54.lineTo(685.8, 157.9);
        shape54.curveTo(689.615, 163.878, 690.86, 167.317, 692.6, 173.5);
        shape54.lineTo(706.2, 179.3);
        shape54.lineTo(703.6, 168.9);
        shape54.curveTo(702.609, 165.776, 703.211, 164.433, 705.6, 162.5);
        shape54.lineTo(716.8, 160.3);
        shape54.lineTo(706.2, 155.7);
        shape54.lineTo(711.2, 152.7);
        shape54.lineTo(711.2, 138.5);
        shape54.closePath();
        g2d.setPaint(Color.decode("#211D1D"));
        g2d.fill(shape54);

        GeneralPath shape55 = new GeneralPath(); // HAIR SHADOW - RIGHT
        shape55.moveTo(799.2, 146.5);
        shape55.curveTo(792.182, 139.494, 787.624, 136.936, 778.8, 133.9);
        shape55.curveTo(774.23, 133.195, 771.809, 133.618, 767.8, 136.1);
        shape55.lineTo(775.6, 140.5);
        shape55.lineTo(778.8, 139.5);
        shape55.lineTo(778.8, 142.9);
        shape55.curveTo(785.481, 150.405, 789.272, 153.978, 796.4, 155.3);
        shape55.lineTo(794.6, 157.5);
        shape55.curveTo(797.719, 157.616, 799.446, 157.862, 802.4, 159.3);
        shape55.lineTo(806, 155.3);
        shape55.lineTo(801.6, 153.5);
        shape55.curveTo(801.936, 150.594, 801.274, 149.08, 799.2, 146.5);
        shape55.closePath();
        g2d.setPaint(Color.decode("#211D1D"));
        g2d.fill(shape55);

        GeneralPath shape56 = new GeneralPath(); // HAIR BG - LEFT
        shape56.moveTo(480.4, 394.7);
        shape56.curveTo(476.251, 391.582, 475.455, 389.21, 475.2, 384.5);
        shape56.lineTo(468.2, 387.5);
        shape56.curveTo(464.778, 393.504, 463.998, 396.938, 463.2, 403.1);
        shape56.lineTo(461, 403.1);
        shape56.lineTo(458.6, 398.7);
        shape56.lineTo(454.4, 377.9);
        shape56.curveTo(453.486, 362.372, 454.241, 353.768, 455.576, 338.57);
        shape56.lineTo(455.6, 338.3);
        shape56.lineTo(462.4, 305.3);
        shape56.curveTo(461.404, 293.47, 461.874, 286.812, 464.2, 274.9);
        shape56.curveTo(465.108, 262.612, 466.432, 256.479, 469.4, 246.1);
        shape56.curveTo(470.254, 235.942, 472.522, 231.203, 477.6, 223.3);
        shape56.lineTo(481, 208.7);
        shape56.curveTo(487.92, 198.397, 491.213, 192.444, 496, 181.5);
        shape56.curveTo(499.308, 170.244, 502.363, 164.05, 508.8, 153.1);
        shape56.curveTo(518.687, 144.433, 525.305, 140.475, 538.4, 134.5);
        shape56.curveTo(548.748, 128.701, 555.547, 126.193, 569, 122.7);
        shape56.curveTo(582.911, 118.289, 591.167, 116.261, 607.2, 113.9);
        shape56.curveTo(620.119, 111.037, 627.946, 110.503, 643.4, 112.3);
        shape56.curveTo(657.13, 115.115, 663.089, 118.677, 671.2, 127.9);
        shape56.curveTo(667.417, 140.916, 666.577, 147.618, 664.8, 159.7);
        shape56.curveTo(651.2, 181.583, 641.199, 193.445, 635.6, 216.7);
        shape56.lineTo(616.8, 231.3);
        shape56.curveTo(597.709, 245.249, 588.324, 254.742, 574.6, 275.5);
        shape56.curveTo(557.879, 298.526, 545.192, 310.47, 526, 332.3);
        shape56.curveTo(523.277, 343.841, 522.281, 350.272, 522.6, 361.7);
        shape56.curveTo(520.093, 368.816, 518.247, 372.398, 514, 377.9);
        shape56.curveTo(502.084, 390.12, 495.222, 396.122, 480.4, 394.7);
        shape56.closePath();
        g2d.setPaint(Color.decode("#3F312D"));
        g2d.fill(shape56);

        GeneralPath shape57 = new GeneralPath(); // HAIR SHADOW - LEFT (until last shape)
        shape57.moveTo(616.8, 155.9);
        shape57.lineTo(620, 152.3);
        shape57.lineTo(623.4, 154.9);
        shape57.lineTo(623, 161.3);
        shape57.lineTo(619, 171.5);
        shape57.lineTo(611.8, 180.5);
        shape57.lineTo(603, 181.5);
        shape57.lineTo(601.4, 174.1);
        shape57.curveTo(602.54, 169.17, 603.735, 166.491, 608.4, 162.1);
        shape57.lineTo(613.6, 155.3);
        shape57.lineTo(616.8, 155.9);
        shape57.closePath();
        g2d.setPaint(Color.decode("#271E1C"));
        g2d.fill(shape57);

        GeneralPath shape58 = new GeneralPath();
        shape58.moveTo(548.601, 273.5);
        shape58.lineTo(548.601, 265.9);
        shape58.lineTo(557.401, 272.1);
        shape58.lineTo(548.601, 273.5);
        shape58.closePath();
        g2d.setPaint(Color.decode("#2B1F1C"));
        g2d.fill(shape58);

        GeneralPath shape59 = new GeneralPath();
        shape59.moveTo(525.4, 177.5);
        shape59.lineTo(544.4, 181.7);
        shape59.lineTo(535.6, 190.5);
        shape59.lineTo(536, 193.5);
        shape59.curveTo(526.998, 202.265, 522.929, 208.237, 516.8, 220.1);
        shape59.lineTo(512.8, 217.5);
        shape59.curveTo(514.571, 210.262, 515.046, 206.038, 513.4, 197.7);
        shape59.curveTo(512.91, 193.946, 511.017, 193.134, 504.6, 194.1);
        shape59.curveTo(502.376, 198.074, 499.595, 199.949, 493.8, 203.1);
        shape59.lineTo(498.8, 189.3);
        shape59.lineTo(525.4, 177.5);
        shape59.closePath();
        g2d.setPaint(Color.decode("#635653"));
        g2d.fill(shape59);

        GeneralPath shape60 = new GeneralPath();
        shape60.moveTo(482.4, 262.9);
        shape60.lineTo(478.6, 267.7);
        shape60.lineTo(480, 270.7);
        shape60.lineTo(477.2, 276.3);
        shape60.lineTo(481.4, 282.9);
        shape60.curveTo(485.622, 278.862, 487.357, 276.289, 488.4, 270.7);
        shape60.lineTo(487.2, 267.1);
        shape60.lineTo(490.2, 261.1);
        shape60.lineTo(488.4, 251.3);
        shape60.lineTo(483.8, 256.3);
        shape60.lineTo(482.4, 262.9);
        shape60.closePath();
        g2d.setPaint(Color.decode("#271E1D"));
        g2d.fill(shape60);

        GeneralPath shape61 = new GeneralPath();
        shape61.moveTo(480, 383.5);
        shape61.lineTo(484, 379.3);
        shape61.lineTo(481.4, 377.1);
        shape61.lineTo(491.6, 360.7);
        shape61.lineTo(497.4, 356.3);
        shape61.lineTo(498.8, 359.3);
        shape61.lineTo(504.2, 357.9);
        shape61.lineTo(506.8, 351.1);
        shape61.lineTo(516, 350.3);
        shape61.lineTo(520.2, 361.9);
        shape61.curveTo(519.707, 369.343, 517.998, 373.128, 510.6, 378.7);
        shape61.curveTo(503.467, 385.128, 498.319, 387.315, 486.6, 388.1);
        shape61.lineTo(480, 383.5);
        shape61.closePath();
        g2d.setPaint(Color.decode("#231B1A"));
        g2d.fill(shape61);

        GeneralPath shape62 = new GeneralPath();
        shape62.moveTo(564.4, 232.1);
        shape62.lineTo(557.6, 238.9);
        shape62.lineTo(564.4, 246.5);
        shape62.lineTo(571.6, 244.1);
        shape62.lineTo(573, 235.7);
        shape62.lineTo(568.2, 224.9);
        shape62.lineTo(565.4, 227.5);
        shape62.lineTo(564.4, 232.1);
        shape62.closePath();
        g2d.setPaint(Color.decode("#2B1F1C"));
        g2d.fill(shape62);

        GeneralPath shape63 = new GeneralPath();
        shape63.moveTo(560.4, 251.1);
        shape63.lineTo(561.4, 247.9);
        shape63.lineTo(566, 254.5);
        shape63.lineTo(563.6, 258.5);
        shape63.curveTo(563.099, 255.389, 562.461, 253.751, 560.4, 251.1);
        shape63.closePath();
        g2d.setPaint(Color.decode("#2B1F1C"));
        g2d.fill(shape63);

        GeneralPath shape64 = new GeneralPath();
        shape64.moveTo(553.6, 234.7);
        shape64.lineTo(552.8, 243.1);
        shape64.lineTo(562.4, 224.7);
        shape64.lineTo(553.6, 234.7);
        shape64.closePath();
        g2d.setPaint(Color.decode("#2B1F1C"));
        g2d.fill(shape64);

        GeneralPath shape65 = new GeneralPath();
        shape65.moveTo(540.4, 208.7);
        shape65.lineTo(540.4, 222.9);
        shape65.lineTo(556.8, 211.7);
        shape65.lineTo(554.2, 208.7);
        shape65.lineTo(567.6, 202.5);
        shape65.lineTo(575, 190.9);
        shape65.lineTo(564.2, 195.9);
        shape65.curveTo(564.905, 189.805, 566.866, 186.511, 571.2, 180.7);
        shape65.curveTo(564.57, 185.288, 560.621, 187.347, 552.8, 189.3);
        shape65.lineTo(540.4, 208.7);
        shape65.closePath();
        g2d.setPaint(Color.decode("#625451"));
        g2d.fill(shape65);

        GeneralPath shape66 = new GeneralPath();
        shape66.moveTo(524, 151.7);
        shape66.curveTo(513.437, 160.704, 508.708, 166.845, 503, 180.3);
        shape66.lineTo(524.6, 170.7);
        shape66.lineTo(536, 173.1);
        shape66.curveTo(533.348, 164.011, 530.657, 159.348, 524, 151.7);
        shape66.closePath();
        g2d.setPaint(Color.decode("#888481"));
        g2d.fill(shape66);

        GeneralPath shape67 = new GeneralPath();
        shape67.moveTo(656.4, 140.3);
        shape67.lineTo(638.6, 139.3);
        shape67.lineTo(633.6, 143.9);
        shape67.lineTo(633.6, 148.3);
        shape67.lineTo(629.8, 149.9);
        shape67.lineTo(629.2, 167.3);
        shape67.lineTo(631.6, 170.5);
        shape67.lineTo(647.6, 171.9);
        shape67.lineTo(650.2, 169.5);
        shape67.lineTo(651, 159.3);
        shape67.curveTo(652.093, 151.928, 653.318, 148.194, 657.6, 142.9);
        shape67.lineTo(656.4, 140.3);
        shape67.closePath();
        g2d.setPaint(Color.decode("#271E1C"));
        g2d.fill(shape67);
        // END HAIR
        
        // START EYES
        GeneralPath shape68 = new GeneralPath(); // RIGHT EYE
        shape68.moveTo(832, 394.7);
        shape68.curveTo(833.813, 374.326, 835.614, 363.85, 840.4, 347.1);
        shape68.lineTo(826.6, 340.9);
        shape68.lineTo(797, 336.5);
        shape68.lineTo(752.8, 343.5);
        shape68.lineTo(743, 384.9);
        shape68.lineTo(750.8, 413.3);
        shape68.lineTo(764.2, 433.1);
        shape68.lineTo(783, 442.5);
        shape68.lineTo(810.4, 446.7);
        shape68.lineTo(839, 436.1);
        shape68.lineTo(832, 394.7);
        g2d.setPaint(Color.decode("#A98169"));
        g2d.fill(shape68);

        GeneralPath shape69 = new GeneralPath(); // RIGHT EYEBROW
        shape69.moveTo(777.6, 332.9);
        shape69.lineTo(774.2, 320.1);
        shape69.curveTo(802.179, 315.717, 816.472, 317.393, 828.8, 326.1);
        shape69.curveTo(831.954, 329.616, 833.098, 331.506, 833.8, 334.7);
        shape69.curveTo(816, 328.121, 803.694, 327.727, 777.6, 332.9);
        shape69.closePath();
        g2d.setPaint(Color.decode("#583129"));
        g2d.fill(shape69);

        GeneralPath shape70 = new GeneralPath(); // LEFT EYEBROW
        shape70.moveTo(607, 295.3);
        shape70.curveTo(598.984, 299.887, 595.5, 302.659, 590.8, 307.9);
        shape70.curveTo(627.932, 309.898, 648.104, 313.098, 682.6, 322.5);
        shape70.curveTo(680.58, 312.169, 678.305, 307.995, 671.6, 304.3);
        shape70.curveTo(648.508, 295.485, 634.385, 293.504, 607, 295.3);
        shape70.closePath();
        g2d.setPaint(Color.decode("#583129"));
        g2d.fill(shape70);

        GeneralPath shape71 = new GeneralPath(); // LEFT EYE
        shape71.moveTo(698, 342.9);
        shape71.curveTo(662.774, 320.382, 640.241, 315.775, 596.4, 318.1);
        shape71.lineTo(576.2, 364.3);
        shape71.curveTo(613.206, 391.641, 635.294, 404.409, 687.4, 402.9);
        shape71.curveTo(697.417, 380.319, 701.187, 367.391, 698, 342.9);
        shape71.closePath();
        g2d.setPaint(Color.decode("#9F7965"));
        g2d.fill(shape71);
        
        GeneralPath shape72 = new GeneralPath(); // LEFT EYE
        shape72.moveTo(677.2, 336.1);
        shape72.curveTo(663.189, 326.409, 653.783, 323.769, 635.2, 322.3);
        shape72.lineTo(644.2, 334.7);
        shape72.curveTo(644.122, 338.085, 643.142, 339.601, 639.4, 341.5);
        shape72.curveTo(635.351, 340.538, 633.122, 340.168, 629.2, 339.7);
        shape72.curveTo(626.845, 340.452, 625.479, 341.221, 623, 342.9);
        shape72.lineTo(627.4, 344.3);
        shape72.curveTo(620.685, 345.444, 617.252, 346.338, 611.6, 348.3);
        shape72.curveTo(607.62, 350.408, 605.154, 351.881, 600.6, 354.7);
        shape72.curveTo(596.778, 356.599, 594.586, 357.788, 590.2, 361.1);
        shape72.lineTo(591.6, 364.5);
        shape72.curveTo(597.578, 365.219, 601.086, 365.521, 608.2, 365.5);
        shape72.curveTo(613.507, 367.462, 616.411, 368.884, 621.4, 372.3);
        shape72.curveTo(628.525, 375.674, 632.609, 377.431, 640.6, 379.5);
        shape72.curveTo(646.649, 381.795, 650.016, 382.562, 656, 383.5);
        shape72.curveTo(659.396, 385.112, 661.524, 386.03, 665.8, 387.7);
        shape72.curveTo(668.497, 384.49, 669.861, 382.628, 671.8, 379.1);
        shape72.curveTo(678.283, 373.365, 681.51, 369.998, 683.8, 362.7);
        shape72.curveTo(684.334, 350.165, 683.641, 343.822, 677.2, 336.1);
        g2d.setPaint(Color.decode("#865642"));
        g2d.fill(shape72);

        GeneralPath shape73 = new GeneralPath(); // LEFT EYE
        shape73.moveTo(631.8, 333.5);
        shape73.curveTo(632.767, 332.016, 632.831, 331.184, 631.8, 329.7);
        shape73.lineTo(612.8, 324.1);
        shape73.lineTo(593.2, 320.1);
        shape73.lineTo(576.6, 325.5);
        shape73.lineTo(566.8, 344.9);
        shape73.lineTo(568.8, 373.7);
        shape73.lineTo(578, 403.9);
        shape73.lineTo(597, 421.9);
        shape73.lineTo(629.6, 430.3);
        shape73.lineTo(661.6, 426.5);
        shape73.lineTo(682, 412.3);
        shape73.lineTo(691, 391.9);
        shape73.lineTo(674.4, 388.9);
        shape73.curveTo(660.91, 392.765, 653.503, 394.831, 644.6, 395.7);
        shape73.lineTo(640.4, 391.9);
        shape73.curveTo(641.085, 389.342, 641.095, 387.939, 640.4, 385.5);
        shape73.curveTo(627.721, 377.171, 620.356, 371.94, 609.8, 367.3);
        shape73.lineTo(583.4, 365.9);
        shape73.curveTo(582.598, 364.916, 581.887, 364.483, 580.645, 363.727);
        shape73.lineTo(580.6, 363.7);
        shape73.curveTo(584.307, 358.787, 586.603, 356.286, 591.8, 353.1);
        shape73.curveTo(595.109, 347.916, 597.659, 345.436, 603, 341.5);
        shape73.curveTo(609.388, 339.95, 612.063, 338.808, 616.6, 336.7);
        shape73.curveTo(621.82, 334.092, 625.011, 333.127, 631.8, 333.5);
        g2d.setPaint(Color.decode("#BBA291"));
        g2d.fill(shape73);

        GeneralPath shape74 = new GeneralPath(); // LEFT EYE
        shape74.moveTo(598.4, 364.1);
        shape74.lineTo(597.6, 360.1);
        shape74.curveTo(598.811, 358.06, 599.793, 357.063, 602, 355.5);
        shape74.curveTo(608.412, 351.679, 612.082, 349.806, 618.8, 347.1);
        shape74.curveTo(626.538, 345.66, 630.893, 344.967, 638.8, 344.7);
        shape74.curveTo(645.485, 345.16, 649.231, 345.419, 655.4, 347.1);
        shape74.curveTo(661.234, 351.702, 663.61, 354.376, 666.4, 359.3);
        shape74.curveTo(670.098, 364.092, 671.489, 366.808, 672.8, 371.7);
        shape74.curveTo(669.535, 372.698, 667.497, 372.874, 663.6, 372.7);
        shape74.curveTo(660.372, 372.448, 658.615, 372.183, 656, 370.5);
        shape74.curveTo(658.13, 368.401, 658.848, 367.219, 659.2, 365.1);
        shape74.curveTo(656.971, 357.142, 652.908, 357.204, 645.6, 353.5);
        shape74.lineTo(626.8, 351.5);
        shape74.curveTo(616.398, 352.129, 611.169, 354.345, 603.4, 363.1);
        shape74.lineTo(598.4, 364.1);
        g2d.setPaint(Color.decode("#5F3026"));
        g2d.fill(shape74);

        GeneralPath shape75 = new GeneralPath(); // LEFT EYE
        shape75.moveTo(602, 418.3);
        shape75.curveTo(592.356, 403.422, 586.293, 396.608, 574, 387.9);
        shape75.lineTo(578.8, 405.3);
        shape75.lineTo(590.4, 417.1);
        shape75.lineTo(602, 418.3);
        g2d.setPaint(Color.decode("#D1C7C0"));
        g2d.fill(shape75);

        GeneralPath shape76 = new GeneralPath(); // LEFT EYE
        shape76.moveTo(577.4, 383.1);
        shape76.curveTo(574.656, 376.271, 573.753, 372.737, 574.0, 367.3);
        shape76.lineTo(587.8, 370.7);
        shape76.curveTo(593.203, 370.003, 596.224, 370.22, 601.6, 372.1);
        shape76.curveTo(608.05, 375.7, 610.334, 377.772, 613.6, 381.5);
        shape76.curveTo(621.133, 388.22, 623.403, 392.58, 625.0, 401.1);
        shape76.curveTo(621.227, 406.109, 618.323, 408.288, 612.8, 411.9);
        shape76.curveTo(604.541, 408.33, 600.297, 404.25, 593.0, 395.5);
        shape76.curveTo(591.959, 392.936, 591.75, 391.535, 592.0, 389.1);
        shape76.curveTo(585.853, 387.288, 582.75, 385.862, 577.4, 383.1);
        g2d.setPaint(Color.decode("#CEC4BC"));
        g2d.fill(shape76);

        GeneralPath shape77 = new GeneralPath(); // RIGHT EYE
        shape77.moveTo(766.6, 395.5);
        shape77.curveTo(755.632, 385.308, 749.056, 379.04, 746.0, 379.1);
        shape77.lineTo(744.2, 362.3);
        shape77.lineTo(754.4, 342.3);
        shape77.lineTo(796.4, 339.1);
        shape77.curveTo(793.613, 343.994, 792.926, 347.275, 793.6, 354.3);
        shape77.curveTo(804.042, 356.195, 807.56, 359.102, 816.0, 367.1);
        shape77.curveTo(818.143, 373.57, 817.883, 377.008, 817.6, 383.5);
        shape77.curveTo(813.28, 383.657, 811.579, 383.34, 808.0, 382.1);
        shape77.curveTo(799.354, 384.411, 795.669, 386.445, 790.4, 390.9);
        shape77.curveTo(781.707, 393.538, 776.535, 394.603, 766.6, 395.5);
        g2d.setPaint(Color.decode("#845542"));
        g2d.fill(shape77);

        GeneralPath shape78 = new GeneralPath(); // RIGHT EYE
        shape78.moveTo(786.401, 384.3);
        shape78.curveTo(772.533, 382.086, 765.388, 380.908, 754.001, 378.7);
        shape78.curveTo(753.205, 377.216, 753.316, 376.384, 754.001, 374.9);
        shape78.curveTo(756.644, 369.559, 758.38, 366.662, 762.001, 361.7);
        shape78.curveTo(765.538, 357.895, 768.051, 356.412, 773.401, 354.9);
        shape78.curveTo(782.899, 354.527, 788.122, 354.983, 797.201, 357.3);
        shape78.lineTo(791.401, 359.7);
        shape78.curveTo(799.43, 360.253, 803.188, 361.906, 809.201, 366.1);
        shape78.curveTo(812.199, 368.811, 813.898, 370.94, 817.001, 377.1);
        shape78.curveTo(817.485, 377.725, 817.462, 378.075, 817.001, 378.7);
        shape78.lineTo(809.201, 378.7);
        shape78.curveTo(808.444, 378.242, 808.25, 377.851, 808.001, 377.1);
        shape78.lineTo(786.401, 384.3);
        g2d.setPaint(Color.decode("#5D3126"));
        g2d.fill(shape78);

        GeneralPath shape79 = new GeneralPath(); // RIGHT EYE
        shape79.moveTo(832.2, 390.5);
        shape79.curveTo(836.302, 408.23, 837.018, 418.261, 839.2, 436.1);
        shape79.lineTo(827.8, 443.9);
        shape79.lineTo(809.0, 445.9);
        shape79.curveTo(805.519, 442.158, 804.318, 440.0, 802.8, 436.1);
        shape79.curveTo(802.065, 423.465, 802.083, 416.507, 802.8, 404.3);
        shape79.curveTo(804.258, 400.154, 805.512, 397.975, 809.0, 394.5);
        shape79.curveTo(813.949, 392.863, 816.744, 392.176, 821.8, 391.5);
        shape79.curveTo(821.861, 382.059, 821.516, 376.761, 820.0, 367.3);
        shape79.curveTo(816.475, 360.01, 814.18, 356.127, 809.0, 349.9);
        shape79.curveTo(809.336, 348.005, 809.706, 347.106, 810.8, 345.9);
        shape79.curveTo(812.954, 344.338, 814.459, 344.007, 817.6, 344.3);
        shape79.curveTo(823.816, 345.494, 826.718, 347.464, 831.2, 352.5);
        shape79.curveTo(831.881, 367.344, 832.085, 375.664, 832.2, 390.5);
        g2d.setPaint(Color.decode("#B9A08D"));
        g2d.fill(shape79);

        GeneralPath shape80 = new GeneralPath(); // RIGHT EYE - WHITE
        shape80.moveTo(771, 365.9);
        shape80.curveTo(765.877, 366.837, 763.637, 368.466, 761, 373.7);
        shape80.curveTo(763.855, 376.077, 766.053, 377.358, 771.6, 379.5);
        shape80.curveTo(774.296, 378.714, 774.244, 378.363, 774.8, 377.7);
        shape80.curveTo(775.582, 372.553, 775.695, 369.745, 771, 365.9);
        shape80.closePath();
        g2d.setPaint(Color.decode("#927567"));
        g2d.fill(shape80);

        GeneralPath shape81 = new GeneralPath(); // RIGHT EYE - WHITE
        shape81.moveTo(808, 377.1);
        shape81.curveTo(803.23, 370.759, 800.698, 368.291, 796.6, 367.1);
        shape81.lineTo(790.6, 382.5);
        shape81.curveTo(799.769, 380.925, 803.409, 379.704, 808, 377.1);
        shape81.closePath();
        g2d.setPaint(Color.decode("#B09E92"));
        g2d.fill(shape81);

        GeneralPath shape82 = new GeneralPath(); // RIGHT EYE - PUPIL
        shape82.moveTo(787.6, 361.9);
        shape82.curveTo(778.805, 361.143, 774.864, 361.768, 772.2, 367.5);
        shape82.curveTo(771.097, 372.29, 771.633, 374.63, 773.6, 378.5);
        shape82.curveTo(776.162, 380.67, 777.991, 381.557, 782, 382.5);
        shape82.curveTo(785.781, 383.198, 787.557, 383.021, 790.6, 382.5);
        shape82.curveTo(794.61, 376.528, 796.108, 373.035, 797.2, 366.5);
        shape82.curveTo(795.019, 364.151, 792.932, 363.135, 787.6, 361.9);
        shape82.closePath();
        g2d.setPaint(Color.decode("#2C1613"));
        g2d.fill(shape82);

        GeneralPath shape83 = new GeneralPath(); // RIGHT EYE - PUPIL
        shape83.moveTo(782.4, 369.5);
        shape83.lineTo(779.6, 372.5);
        shape83.lineTo(784.8, 372.5);
        shape83.lineTo(782.4, 369.5);
        shape83.closePath();
        g2d.setPaint(Color.decode("#4F3C36"));
        g2d.fill(shape83);

        GeneralPath shape84 = new GeneralPath(); // LEFT EYE - WHITE
        shape84.moveTo(610.2, 361.5);
        shape84.curveTo(609.813, 360.546, 609.866, 359.968, 610.2, 358.9);
        shape84.curveTo(615.667, 353.977, 618.693, 352.138, 624, 351.3);
        shape84.lineTo(627.6, 367.7);
        shape84.curveTo(627.009, 369.045, 626.409, 369.58, 624.8, 370.1);
        shape84.curveTo(618.305, 367.268, 615.015, 365.446, 610.2, 361.5);
        shape84.closePath();
        g2d.setPaint(Color.decode("#AC9C93"));
        g2d.fill(shape84);

        GeneralPath shape85 = new GeneralPath(); // LEFT EYE - WHITE
        shape85.moveTo(643.6, 369.5);
        shape85.curveTo(644.969, 362.772, 646.001, 359.079, 649.2, 352.9);
        shape85.curveTo(650.04, 352.725, 650.485, 352.785, 651.2, 353.3);
        shape85.curveTo(653.616, 355.625, 654.777, 357.053, 656.4, 359.9);
        shape85.curveTo(656.608, 362.252, 656.605, 363.657, 655.8, 366.3);
        shape85.curveTo(651.233, 369.164, 648.549, 369.754, 643.6, 369.5);
        shape85.closePath();
        g2d.setPaint(Color.decode("#96776A"));
        g2d.fill(shape85);

        GeneralPath shape86 = new GeneralPath(); // LEFT EYE - PUPIL
        shape86.moveTo(647.4, 352.5);
        shape86.curveTo(639.498, 346.165, 634.316, 346.257, 623.8, 352.5);
        shape86.curveTo(622.83, 355.439, 622.647, 357.057, 622.8, 359.9);
        shape86.curveTo(623.694, 363.539, 624.751, 365.444, 627.2, 368.7);
        shape86.curveTo(633.809, 371.749, 637.444, 371.877, 643.8, 369.5);
        shape86.curveTo(646.113, 366.648, 647.307, 364.926, 648.8, 361.1);
        shape86.curveTo(649.252, 357.63, 648.793, 355.743, 647.4, 352.5);
        shape86.closePath();
        g2d.setPaint(Color.decode("#291412"));
        g2d.fill(shape86);

        GeneralPath shape87 = new GeneralPath(); // LEFT EYE - PUPIL
        shape87.moveTo(635.8, 356.7);
        shape87.lineTo(630.8, 359.5);
        shape87.lineTo(635.8, 361.7);
        shape87.lineTo(635.8, 356.7);
        shape87.closePath();
        g2d.setPaint(Color.decode("#59413B"));
        g2d.fill(shape87);
        // END EYES
        
        // START GLASSES
        GeneralPath shape88 = new GeneralPath(); // GLASSES - LEFT FRAME
        shape88.moveTo(521.4, 366.5);
        shape88.lineTo(521.4, 356.7);
        shape88.lineTo(549, 320.7);
        shape88.lineTo(549, 333.9);
        shape88.lineTo(521.4, 366.5);
        shape88.closePath();
        g2d.setPaint(Color.decode("#715E50"));
        g2d.fill(shape88);

        GeneralPath shape89 = new GeneralPath(); // GLASSES - RIGHT FRAME
        shape89.moveTo(833, 387.7);
        shape89.lineTo(833, 379.9);
        shape89.lineTo(859, 369.5);
        shape89.lineTo(859, 376.3);
        shape89.lineTo(833, 387.7);
        shape89.closePath();
        g2d.setPaint(Color.decode("#715E50"));
        g2d.fill(shape89);

        GeneralPath shape90 = new GeneralPath(); // GLASSES - MIDDLE
        shape90.moveTo(744.8, 347.7);
        shape90.curveTo(729.57, 340.571, 720.174, 339.52, 701.8, 343.3);
        shape90.lineTo(704.4, 351.9);
        shape90.curveTo(719.334, 348.35, 727.206, 349.008, 741.2, 354.9);
        shape90.lineTo(744.8, 347.7);
        shape90.closePath();
        g2d.setPaint(Color.decode("#715E50"));
        g2d.fill(shape90);

        GeneralPath shape91 = new GeneralPath(); // GLASSES - LEFT LENS ABOVE
        shape91.moveTo(618, 313.1);
        shape91.curveTo(582.787, 314.674, 565.852, 315.613, 549, 320.7);
        shape91.lineTo(549, 333.9);
        shape91.lineTo(555, 335.3);
        shape91.lineTo(563, 346.7);
        shape91.lineTo(565, 358.9);
        shape91.lineTo(572.4, 360.9);
        shape91.lineTo(572.4, 354.3);
        shape91.curveTo(573.204, 347.073, 574.399, 343.518, 577.6, 337.9);
        shape91.curveTo(581.572, 330.375, 585.263, 327.354, 594.2, 323.9);
        shape91.curveTo(604.564, 320.448, 610.718, 319.376, 622.4, 319.1);
        shape91.curveTo(636.705, 320.432, 644.523, 321.741, 658.2, 325.1);
        shape91.curveTo(666.641, 326.832, 670.761, 328.461, 677.8, 331.7);
        shape91.curveTo(685.24, 334.322, 688.381, 338.195, 694.8, 347.1);
        shape91.curveTo(695.833, 353.579, 696.423, 356.865, 696.2, 363.7);
        shape91.curveTo(696.143, 373.576, 695.136, 379.135, 691.2, 389.1);
        shape91.lineTo(696.2, 390.9);
        shape91.lineTo(703.8, 368.5);
        shape91.curveTo(705.437, 363.381, 705.622, 360.712, 705.4, 356.1);
        shape91.curveTo(703.541, 347.179, 703.066, 342.035, 698.6, 337.9);
        shape91.curveTo(687.903, 329.33, 680.388, 325.474, 663.6, 320.7);
        shape91.curveTo(647.88, 314.955, 637.935, 313.26, 618, 313.1);
        shape91.closePath();
        g2d.setPaint(Color.decode("#2D1714"));
        g2d.fill(shape91);

        GeneralPath shape92 = new GeneralPath(); // GLASSES - RIGHT LENS BOTTOM
        shape92.moveTo(750.8, 402.1);
        shape92.lineTo(744, 403.7);
        shape92.lineTo(752.8, 421.7);
        shape92.curveTo(756.427, 427.716, 758.849, 431.031, 764.8, 436.7);
        shape92.curveTo(769.523, 439.427, 772.52, 440.835, 778.6, 443.1);
        shape92.curveTo(787.943, 445.958, 793.202, 447.024, 802.6, 448.5);
        shape92.curveTo(810.648, 448.982, 814.99, 448.572, 822.6, 447.3);
        shape92.curveTo(828.918, 446.034, 831.843, 444.77, 836.6, 442.1);
        shape92.curveTo(841.608, 438.141, 844.126, 435.716, 848.2, 431.1);
        shape92.curveTo(852.854, 422.303, 855.111, 417.308, 858.6, 408.3);
        shape92.lineTo(864.6, 389.7);
        shape92.lineTo(859.8, 382.5);
        shape92.lineTo(854, 405.9);
        shape92.curveTo(850.776, 414.701, 848.478, 419.693, 843.6, 428.7);
        shape92.curveTo(838.586, 434.726, 834.961, 437.684, 826.8, 442.1);
        shape92.curveTo(818.309, 444.429, 813.148, 445.089, 802.6, 444.1);
        shape92.curveTo(791.241, 442.737, 784.935, 441.177, 773.8, 436.7);
        shape92.curveTo(767.38, 432.764, 764.544, 429.879, 760.2, 424.1);
        shape92.curveTo(754.759, 415.918, 752.659, 411.109, 750.8, 402.1);
        shape92.closePath();
        g2d.setPaint(Color.decode("#55362F"));
        g2d.fill(shape92);

        GeneralPath shape93 = new GeneralPath(); // GLASSES - RIGHT LENS TOP 
        shape93.moveTo(875.8, 370.9);
        shape93.lineTo(881.4, 357.1);
        shape93.curveTo(877.37, 352.972, 866.033, 349.414, 840.2, 342.3);
        shape93.curveTo(829.878, 338.316, 823.21, 336.882, 811.462, 334.356);
        shape93.lineTo(811.2, 334.3);
        shape93.curveTo(798.554, 333.042, 791.42, 332.945, 778.6, 334.3);
        shape93.curveTo(766.602, 336.245, 760.103, 337.861, 749.2, 342.3);
        shape93.curveTo(743.581, 348.32, 741.776, 352.501, 739.8, 360.7);
        shape93.curveTo(739.472, 366.285, 739.486, 369.618, 739.8, 375.9);
        shape93.curveTo(739.653, 383.355, 741.265, 390.761, 744, 403.7);
        shape93.lineTo(751, 406.1);
        shape93.lineTo(751, 402.9);
        shape93.curveTo(748.782, 397.378, 747.859, 394.238, 747.2, 388.5);
        shape93.curveTo(746.235, 378.043, 746.355, 372.236, 749.2, 362.1);
        shape93.curveTo(752.668, 352.077, 756.88, 347.655, 769.2, 342.3);
        shape93.curveTo(783.437, 339.912, 792.114, 339.492, 808.6, 340.1);
        shape93.curveTo(821.251, 341.286, 828.189, 343.178, 840.2, 349.3);
        shape93.curveTo(847.959, 356.406, 851.728, 360.914, 857.2, 369.9);
        shape93.curveTo(859.103, 374.507, 859.456, 377.279, 859.8, 382.3);
        shape93.lineTo(864.6, 389.7);
        shape93.curveTo(865.155, 382.478, 866.104, 378.442, 870.6, 371.3);
        shape93.lineTo(875.8, 370.9);
        shape93.closePath();
        g2d.setPaint(Color.decode("#291410"));
        g2d.fill(shape93);

        GeneralPath shape94 = new GeneralPath(); // GLASSES - RIGHT DESIGN
        shape94.moveTo(876, 357.1);
        shape94.lineTo(864.8, 357.1);
        shape94.lineTo(872.8, 362.1);
        shape94.lineTo(876, 357.1);
        shape94.closePath();
        g2d.setPaint(Color.decode("#B0AFAA"));
        g2d.fill(shape94);

        GeneralPath shape95 = new GeneralPath(); // GLASSES - LEFT DESIGN
        shape95.moveTo(554.6, 328.7);
        shape95.lineTo(554.6, 322.5);
        shape95.lineTo(568.2, 327.1);
        shape95.lineTo(554.6, 328.7);
        shape95.closePath();
        g2d.setPaint(Color.decode("#B0AFAA"));
        g2d.fill(shape95);

        GeneralPath shape96 = new GeneralPath(); // GLASSES - LEFT LENS BOTTOM
        shape96.moveTo(572.4, 360.9);
        shape96.lineTo(565, 358.9);
        shape96.curveTo(566.176, 370.833, 567.362, 377.491, 570.6, 389.3);
        shape96.curveTo(572.779, 396.281, 573.897, 400.201, 577.4, 407.1);
        shape96.curveTo(583.162, 415.318, 587.39, 418.46, 596, 422.5);
        shape96.curveTo(610.225, 428.275, 618.62, 430.342, 634.2, 432.3);
        shape96.curveTo(649.913, 431.843, 657.697, 429.848, 670.4, 424.3);
        shape96.lineTo(670.482, 424.249);
        shape96.curveTo(674.869, 421.479, 677.353, 419.91, 682.2, 415.7);
        shape96.curveTo(685.142, 411.524, 686.799, 409.071, 689.8, 404.1);
        shape96.curveTo(692.905, 399.065, 694.338, 396.181, 696.2, 390.9);
        shape96.lineTo(691.2, 389.1);
        shape96.curveTo(689.184, 394.051, 688.026, 396.817, 685.8, 401.7);
        shape96.curveTo(680.59, 409.688, 677.345, 413.923, 669.2, 419.7);
        shape96.curveTo(656.221, 426.368, 648.417, 428.239, 633.4, 427.7);
        shape96.curveTo(609.29, 424.2, 600.933, 422.016, 596, 417.7);
        shape96.curveTo(585.264, 409.686, 581.039, 404.854, 577.4, 395.5);
        shape96.curveTo(573.767, 381.989, 572.331, 374.413, 572.4, 360.9);
        shape96.closePath();
        g2d.setPaint(Color.decode("#55362F"));
        g2d.fill(shape96);
        // END GLASSES
    }
    
    public static void main(String[] args) {
        CS26115_SelfPortrait s = new CS26115_SelfPortrait();
        s.setTitle("Self Portrait - Dayo, Andrea - 4CSA");
        s.setBackground(Color.WHITE);
        s.setSize(1200, 900);
        s.setForeground(Color.RED);
        s.setVisible(true);
    }
}
