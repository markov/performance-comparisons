package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_269 {
    private val production = Production11_269("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}