package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_172 {
    private val production = Production11_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}