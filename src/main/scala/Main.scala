package org.zoomll.scalculator

import scalafx.Includes.*
import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.control.{Button, TextField}
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color.*

object Main extends JFXApp3:
  override def start():Unit =
    stage = new JFXApp3.PrimaryStage:
      title = "Scalculator"
      width = 500
      height = 600
      resizable = false
      scene = new Scene:
        fill = Red
        content = new HBox {
          children = Seq(
            new TextField {
              style = "-fx-font: normal 44pt monospace"
            },
            new Button {
              text = "Enter"

            }
          )
        }