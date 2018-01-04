package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_274 {
    private val production = Production15_274("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}