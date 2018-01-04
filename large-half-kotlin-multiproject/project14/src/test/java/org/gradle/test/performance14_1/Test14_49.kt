package org.gradle.test.performance14_1

import org.junit.Assert.*

class Test14_49 {
    private val production = Production14_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}