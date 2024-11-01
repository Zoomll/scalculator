package org.zoomll.scalculator

import com.sun.org.apache.xalan.internal.lib.ExsltStrings.padding
import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout.StackPane
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

object Main extends JFXApp3:
  override def start():Unit =
    stage = new JFXApp3.PrimaryStage:
      title = "Test"
      width = 500
      height = 500
      scene = new Scene:
        fill = LightGreen
        content = new Rectangle:
          x = 25
          y = 40
          width = 100
          height = 100