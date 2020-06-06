package InheritancePolymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
        // Input input = new Input();
        // TextBox textBox = new TextBox();

        // Input input2 = new Input();

        // System.out.println(input.equals(input2));
        // textBox.setText("HALO DUNIA!");
        // textBox.clear();
        // input.disable();
        // System.out.println(textBox.isEnabled());

        // TextBox textBox = new TextBox();
        // textBox.setText("hello world!");

        // System.out.println(textBox);

        // Point point1 = new Point(1,2);
        // Point point2 = new Point(1,2);

        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());
        // show(textBox);

        // Input[] inputs =  { new TextBox(), new CheckBox() };
        // for(int i = 0 ; i < inputs.length;i++){
        //     inputs[i].render();
        // }

        PajakCalculator2impl calculator = new PajakCalculator2impl();
        PajakReport report = new PajakReport(calculator);

        report.show();
    }

    public static void show(Input input){
        if(input instanceof TextBox) {
        TextBox textBox = (TextBox) input;
        textBox.setText("text sudah di ganti");
        }

        System.out.println(input);
    }
}
