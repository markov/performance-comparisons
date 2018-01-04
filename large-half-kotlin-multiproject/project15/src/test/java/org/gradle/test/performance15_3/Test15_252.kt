package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_252 {
    private val production = Production15_252("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}