package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_209 {
    private val production = Production14_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}