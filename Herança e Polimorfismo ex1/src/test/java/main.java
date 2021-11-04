public class main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Gerente 1");
        Gerente g = new Gerente("Lorenzo", 30,5000.00);
        System.out.println(g.exibeDados());
        System.out.println();

        System.out.println("Gerente 2");
        Gerente g2 = new Gerente("Roberta", 40,8000.00);
        System.out.println(g2.exibeDados());
        System.out.println();

        System.out.println("Assistente 1");
        Assistente ast = new Assistente("Leonardo", 19, 1515, 2500.00, g);
        System.out.println(ast.exibeDados());
        System.out.println();

        System.out.println("Técnico 1");
        Tecnico tec = new Tecnico("Maria Eduarda", 19, 1617, 2560.00, g, 200);
        System.out.println(tec.exibeDados());
        System.out.println();

        System.out.println("Técnico 2");
        Tecnico tec2 = new Tecnico("Marcia", 35, 1318, 2900.00, g2, 300);
        System.out.println(tec2.exibeDados());
        System.out.println();

        System.out.println("Administrador 1");
        Administrativo ad = new Administrativo("Evandro", 45, 1418, 3000.00, g2, 'n');
        System.out.println(ad.exibeDados());
        System.out.println();

        System.out.println("Administrador 2");
        Administrativo ad2 = new Administrativo("Pedro", 20, 1419, 2300.00, g2, 'D');
        System.out.println(ad2.exibeDados());
        System.out.println();
    }
}
