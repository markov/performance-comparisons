package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_136 {
    private val production = Production30_136("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}