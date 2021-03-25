package tsn.javase.lab06;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Form1 extends javax.swing.JFrame {

    public class MyPicture extends JPanel { // КЛАСС РИСОВАНИЯ СВОЕЙ КАРТИНКИ

        Graphics2D canvas;   // Класс рисования
        BufferedImage buff;  // Буферное изображение
        int x = 400; // Константа размера полотна по х
        int y = 250; // Константа размера полотна по y

        MyPicture() {
            // Создаем буферное полотно для рисования размером x-y
            buff = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);
            // Создаем двустороннюю связь между буферным изображением и классом рисования
            canvas = (Graphics2D) buff.getGraphics();

            canvas.setPaint(Color.WHITE); // Устанавливаем цвет рисования серым
            canvas.fillRect(0, 0, x, y); // Заливаем полотно для рисования

            canvas.setPaint(Color.ORANGE); // Red-orange нужно сделать
            RoundRectangle2D.Double rectangle2D2 = new RoundRectangle2D.Double(100, 100, 60, 50, 40, 40);
            canvas.fill(rectangle2D2);
            
            canvas.setPaint(Color.BLACK);
            canvas.setPaint(Color.BLACK); // Устанавливаем цвет рисования черным
            canvas.drawRoundRect(100, 100, 60, 50,40, 40);  // Отрисовываем  овал
            
            Line2D line = new Line2D.Double(127, 100, 135, 90);
            canvas.setPaint(Color.red);
            canvas.draw(line);
            
            Line2D line_2 = new Line2D.Double(128, 100, 136, 90);
            canvas.setPaint(Color.BLACK);
            canvas.draw(line_2);      
            
                
                // Глаза
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(115, 120); // нач. точка
                generalPath.lineTo(125, 120);
                generalPath.moveTo(115, 120);
                generalPath.lineTo(120, 110);
                generalPath.moveTo(115, 120);
                generalPath.lineTo(120, 110);
                generalPath.moveTo(120, 110);
                generalPath.lineTo(125, 120);
                canvas.draw(generalPath);

                GeneralPath generalPath2 = new GeneralPath();
                generalPath.moveTo(135, 120); // нач. точка
                generalPath.lineTo(145, 120);
                generalPath.moveTo(135, 120);
                generalPath.lineTo(140, 110);
                generalPath.moveTo(140, 110);
                generalPath.lineTo(145, 120);
                canvas.draw(generalPath);
                
                // Улыбка
                QuadCurve2D quadCurve2D = new QuadCurve2D.Double(0, 150, 0, 0, 0, 150);
              //  QuadCurve2D quadCurve2D = new QuadCurve2D.Double(x, y, ERROR, ERROR, x, y)
                canvas.draw(quadCurve2D);




// Линии
            
            
            
            
            
            
//            Point2D point = new Point2D.Double();
//            Point2D point2 = new Point2D.Double();      
            
//            Point2D point1 =new Point2D.Double(100, 110);
//            Point2D point2 =new Point2D.Double(108, 115);
//            Point2D point3 =new Point2D.Double();
//            Point2D point4 =new Point2D.Double();
//            Point2D point5 =new Point2D.Double();
//            Point2D point6 =new Point2D.Double();
//            Point2D point7 =new Point2D.Double();
//            Point2D point8 =new Point2D.Double();
//            Point2D point9 =new Point2D.Double();
//            Point2D point10 =new Point2D.Double();
//            Point2D point11 =new Point2D.Double();
//            Point2D point12 =new Point2D.Double();
//            Point2D point13 =new Point2D.Double();
//            Point2D point14 =new Point2D.Double();
//            Point2D point15 =new Point2D.Double();
//            Point2D point16 =new Point2D.Double();            
            
            
//            Line2D line = new Line2D.Double(100, 103, 155, 94);
//            canvas.draw(line);
            
           
            //??????
            // canvas.shear(0, 0.4);              // смещение координат
            //canvas.translate(0.4, 0.5);      // передвигать
            //canvas.scale(x, y);              // изм-е размеров
            //canvas.rotate(WIDTH);            // поворот
 
            // Квадраты 
//            canvas.setPaint(Color.GREEN);
//            RoundRectangle2D.Double rectangle2D3 = new RoundRectangle2D.Double(125, 80, 10, 20, 0, 0);
//            canvas.fill(rectangle2D3);
//            canvas.setPaint(Color.BLACK);
//            RoundRectangle2D.Double rectangle2D4 = new RoundRectangle2D.Double(135, 80, 10, 20, 0, 0);
//            canvas.fill(rectangle2D4);
//            
//            canvas.setPaint(new GradientPaint(new Point(0, 0), Color.WHITE, new Point(200, 100), Color.BLACK));
//            GeneralPath generalPath = new GeneralPath();
            
           // canvas.shear(0.5, 0);
            
          
            //canvas.drawArc // Отрисовываем дугу по середине овала
            //рисуем два мелньких круга сверху и снизу
            //canvas.drawOval(140, 70, 10, 10);
            //canvas.drawOval(140, 170, 10, 10);
            //устанавливаем стиль и пишим текст
//            canvas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
//            canvas.drawString("Java!", 85, 50);

        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g); // Отрисовываем панель и компоненты на ней
            g.drawImage(buff, 0, 0, this); // Отрисовываем буфер с нашим изображением на панель
        }

        private void fill(int x, int y, Color bgcolor, Color color) throws Exception {
            // Заливка фигур методом ромба, параметры: х,y- координаты начала заливки, 
            // bgcolor-цвет который надо закрашивать, color-цвет которым надо закрашивать 
            ArrayList<Point> point = new ArrayList<>(); // Создаем динамический массив точек
            point.add(new Point(x, y)); // Добавляем начальную точку в массив
            Color oldColor = canvas.getColor(); // Сохраняем старый цвет рисования
            canvas.setPaint(color); //ставим цвет закраски
            while (point.size() > 0) { // Пока в массиве имеются точки для закрашивания
                Point p = point.remove(0); // Считываем координаты первой точки, и удаляем ее из массива
                x = p.x;
                y = p.y;
                if (bgcolor.getRGB() == buff.getRGB(x, y)) { // Если ее надо нам закрасить
                    canvas.drawLine(x, y, x, y); // Закрашиваем точку
                    point.add(new Point(x + 1, y)); // Добавляем точку справа
                    point.add(new Point(x - 1, y)); // Добавляем точку слева
                    point.add(new Point(x, y + 1)); // Добавляем точку снизу
                    point.add(new Point(x, y - 1)); // Добавляем точку сверху
                }
            }
            canvas.setPaint(oldColor); //ставим старый цвет рисования
            repaint();  // Перерисовываем изображение
        }
    }

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new MyPicture();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с графикой в Java");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(244, 243, 234));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 290, 240);

        setSize(new java.awt.Dimension(296, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
