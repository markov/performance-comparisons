package org.gradle.test.performance14_2

import org.junit.Assert.*

class Test14_134 {
    private val production = Production14_134("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}