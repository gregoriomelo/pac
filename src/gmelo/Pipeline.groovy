package gmelo

class Pipeline {
    def steps

    Pipeline(steps) {
        this.steps = steps
    }

    def disparar() {
        this.steps.stage("Preparação") {
            this.steps.node("") {
                this.steps.echo "Disparou"
            }
        }
    }
}
