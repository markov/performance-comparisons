package org.gradle.test.performance11_1

import org.junit.Assert.*

class Test11_14 {
    private val production = Production11_14("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}