package org.zoomll.scalculator

import scalafx.application.JFXApp3
import scalafx.scene.Scene

abstract class Main extends JFXApp3:
  override def start():Unit = {
    stage = new JFXApp3.PrimaryStage {
      title = "Test"
      scene = new Scene
    }
  }
