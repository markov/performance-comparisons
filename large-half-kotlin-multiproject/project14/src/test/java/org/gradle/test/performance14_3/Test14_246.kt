package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_246 {
    private val production = Production14_246("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}