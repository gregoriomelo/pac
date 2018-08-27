package gmelo

class StepsMock {

    def mensagensEcoadas = []
    def estagiosCriados = []

    def stage(String nome, Closure bloco) {
        estagiosCriados << nome
        bloco()
    }

    def node(String _, Closure bloco) {
        bloco()
    }

    def echo(String mensagem) {
        mensagensEcoadas << mensagem
    }
}
