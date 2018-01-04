package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_140 {
    private val production = Production7_140("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}