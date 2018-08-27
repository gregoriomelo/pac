package gmelo

class Pipeline {
    def steps

    Pipeline(steps) {
        this.steps = steps
    }

    def disparar() {
        this.steps.stage("Preparação") {
            this.steps.node("maven") {
                this.steps.echo "Disparou"
            }
        }

        this.steps.stage("Quebradeira") {
            this.steps.node("maven") {
                this.steps.error "Quebre tudo!"
            }
        }
    }
}
