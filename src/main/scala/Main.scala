package org.zoomll.scalculator

import com.sun.org.apache.xalan.internal.lib.ExsltStrings.padding
import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout.StackPane
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle

abstract class Main extends JFXApp3:
  override def start():Unit =
    stage = new JFXApp3.PrimaryStage:
      title = "Test"
      scene = new Scene:
        root = new StackPane:
          padding = Insets(30)
          content = new Rectangle:
            width = 200
            height = 200
            fill = Color.Gold