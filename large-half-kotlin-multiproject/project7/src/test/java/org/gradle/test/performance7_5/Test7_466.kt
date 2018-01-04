package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_466 {
    private val production = Production7_466("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}