package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_230 {
    private val production = Production7_230("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}