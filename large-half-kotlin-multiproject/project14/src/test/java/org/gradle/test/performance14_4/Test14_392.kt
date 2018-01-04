package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_392 {
    private val production = Production14_392("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}