package org.gradle.test.performance14_1

import org.junit.Assert.*

class Test14_43 {
    private val production = Production14_43("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}