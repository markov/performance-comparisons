package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_281 {
    private val production = Production14_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}