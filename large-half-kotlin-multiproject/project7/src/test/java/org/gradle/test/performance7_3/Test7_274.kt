package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_274 {
    private val production = Production7_274("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}