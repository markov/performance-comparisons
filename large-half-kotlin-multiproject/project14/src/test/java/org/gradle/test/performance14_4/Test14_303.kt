package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_303 {
    private val production = Production14_303("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}