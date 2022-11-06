class  TesteIgualdade {
    void  teste () {
        String  frase1 ;
        String  frase2 ;

        frase1 = new  String ( "Testando a igualdade" );
        frase2 = new  String ( "Testando a igualdade" );

        Sistema . fora . println ( "Frase 1: " + frase1 );
        Sistema . fora . println ( "Frase 2: " + frase2 );
        Sistema . fora . println ( "Frase 1 e Frase 2 são iguais? R: " + ( frase1 == frase2 ) + "\n\n" );
    }
}

 classe  pública CBBAtividadePrática01 {
    public  static  void  main ( String [] args ) {
        TesteIgualdade  teste = new  TesteIgualdade ();
        teste . teste ();
    }
}
