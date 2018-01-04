package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_274 {
    private val production = Production30_274("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}