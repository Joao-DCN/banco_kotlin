import java.math.BigDecimal
import java.util.Scanner

fun main() {

    // variável de leitura de entradas
    val reader = Scanner(System.`in`)

    // função de print
    TelaInicial()

    // dados do usuario
    print("diga seu nome: ")
    var UsuarioBank = reader.nextLine()
    print("diga sua senha: ")
    var Senha = reader.nextInt()

    // função de print
    TelaBemVindo()

    // variável de saldo do usuario
    var saldo = BigDecimal("0.0")

    // estrutura de repetição infinita
    while (true) {

        // função de mostrar saldo e alterações possíveis
        TelaDeSaldo(saldo)

        // variável de escolha de alternativa
        val alternatva = reader.next()

        // se a escolha for diferente de 0  ativar a função de editar saldo
        if (alternatva != "0") {
            saldo += EditarSaldo(alternatva)
        }

        // se não ativa o break terminando com a estrutura de repetição infinita
        else{
            println("saindo........")
            break
        }
    }
}

// função de print
fun TelaInicial(){
    println("+----------------+")
    println("|   BYTEBANK     |")
    println("+----------------+")
}

// função de print
fun TelaBemVindo(){
    println("+----------------+")
    println("|   BEM VINDO    |")
    println("+----------------+")
}

// função de mostrar saldo e alterações possíveis
fun TelaDeSaldo(saldo: BigDecimal){
    println("+--------------+")
    println("|SALDO ATUAL = | $saldo")
    println("|ADICIONAR   1 |")
    println("|SAQUE       2 |")
    println("|SAIR        0 |")
    println("+--------------+")
}

//função de editar saldo
fun EditarSaldo(escolha: String): BigDecimal{

    val reader = Scanner(System.`in`)

    println("+-----------------+")
    println("|DIGITE O VALOR = |")
    println("+-----------------+")

    var valor = reader.nextBigDecimal()
     if (escolha == "2"){
         valor *= BigDecimal("-1.0")
     }


    return valor
}