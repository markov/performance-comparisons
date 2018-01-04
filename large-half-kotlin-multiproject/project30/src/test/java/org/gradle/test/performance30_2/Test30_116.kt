package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_116 {
    private val production = Production30_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}