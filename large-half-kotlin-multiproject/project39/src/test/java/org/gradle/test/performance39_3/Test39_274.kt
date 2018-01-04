package org.gradle.test.performance39_3

import org.junit.Assert.*

class Test39_274 {
    private val production = Production39_274("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}