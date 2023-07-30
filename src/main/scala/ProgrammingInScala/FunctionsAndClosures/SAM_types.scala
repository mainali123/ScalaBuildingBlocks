package ProgrammingInScala.FunctionsAndClosures

// SAM => Single Abstract Method

import javax.swing.JButton

object SAM_types extends App {
  val button = new JButton
  button.addActionListener(
    _ => println("Pressed")
  )


  def increaseOne(increaser: Increaser): Int =
    increaser.increase(1)

}

trait Increaser:
  def increase(i: Int): Int