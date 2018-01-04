package org.gradle.test.performance14_2

import org.junit.Assert.*

class Test14_106 {
    private val production = Production14_106("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}