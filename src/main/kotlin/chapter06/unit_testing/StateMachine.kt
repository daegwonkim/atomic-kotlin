package chapter06.unit_testing

import chapter06.unit_testing.State.*

enum class State { On, Off, Paused }

class StateMachine {
    var state: State = Off
        private set
    private fun transition(
        new: State, current: State = On
    ) {
        if(new == Off && state != Off)
            state = Off
        else if(state == current)
            state = new
    }
    fun start() = transition(On, Off)
    fun pause() = transition(Paused, On)
    fun resume() = transition(On, Paused)
    fun finish() = transition(Off)
}