package org.gradle.test.performance14_1

import org.junit.Assert.*

class Test14_88 {
    private val production = Production14_88("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}