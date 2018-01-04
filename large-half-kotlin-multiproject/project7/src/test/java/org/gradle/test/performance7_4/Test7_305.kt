package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_305 {
    private val production = Production7_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}