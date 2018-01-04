package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_331 {
    private val production = Production14_331("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}