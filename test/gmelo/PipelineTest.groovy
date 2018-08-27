package gmelo

import spock.lang.Specification

class PipelineTest extends Specification {

    def "Quebra o build no segundo estágio"() {
        given:
        StepsMock steps = new StepsMock()
        def pipeline = new Pipeline(steps)

        when:
        pipeline.disparar()

        then:
        steps.estagiosCriados == ["Preparação", "Quebradeira"]
        steps.mensagensEcoadas == ["Disparou", "Quebre tudo!"]
    }
}
