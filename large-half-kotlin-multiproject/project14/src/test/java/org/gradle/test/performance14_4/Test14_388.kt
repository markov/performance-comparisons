package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_388 {
    private val production = Production14_388("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}