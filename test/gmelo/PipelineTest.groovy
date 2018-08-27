package gmelo

import spock.lang.Specification

class PipelineTest extends Specification {
    def "Disparar a pipeline"() {
        given:
        StepsMock steps = new StepsMock()
        def pipeline = new Pipeline(steps)

        when:
        pipeline.disparar()

        then:
        steps.mensagensEcoadas == ["Disparou"]
        steps.estagiosCriados == ["Preparação"]
    }
}
