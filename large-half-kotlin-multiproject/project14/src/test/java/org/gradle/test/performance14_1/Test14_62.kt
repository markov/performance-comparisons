package org.gradle.test.performance14_1

import org.junit.Assert.*

class Test14_62 {
    private val production = Production14_62("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}