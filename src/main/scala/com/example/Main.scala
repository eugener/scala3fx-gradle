package com.example

import javafx.application.Application

object Main {
    def main(args: Array[String]): Unit = {
       Application.launch(classOf[Main], args: _*)
    }
}

class Main extends javafx.application.Application {

    override def start(primaryStage: javafx.stage.Stage): Unit = {

        primaryStage.setTitle("JavaFX with Scala 3")
        primaryStage.show()
    }
}
