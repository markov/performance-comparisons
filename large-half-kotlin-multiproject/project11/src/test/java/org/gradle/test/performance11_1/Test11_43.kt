package org.gradle.test.performance11_1

import org.junit.Assert.*

class Test11_43 {
    private val production = Production11_43("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}