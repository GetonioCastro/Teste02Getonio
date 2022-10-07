class Desafio {
public static void main(String[] args) {
int anterior = 0;
int atual = 1;
System.out.println(anterior);
while (atual < 100) {
System.out.println(atual);
atual = anterior + atual;
anterior = atual - anterior;
}
System.out.println(atual);
}
}
